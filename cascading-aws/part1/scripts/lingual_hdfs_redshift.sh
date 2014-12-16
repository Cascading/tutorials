#!/bin/bash -ex

if [[ -z "$1" ]] ||  [[ -z "$2" ]] || [[ -z "$3" ]]
then
  echo "needed args are JDBC url, user and password"
  exit 1
fi

echo "start"

#-------------------------------------------------------------------------------------------------------------------------------------

# gather argument variables
REDSHIFT_URL="$1"
REDSHIFT_USER="$2"
REDSHIFT_PASSWORD="$3"
CASCADING_JDBC_PATH="$4"
HDFS_DATA_FILES_PATH="$5"

# tell lingual which platform to run on (local or hadoop)
export LINGUAL_PLATFORM=hadoop
# location of Lingual catalog
CATALOG_PATH=/user/$USER/.lingual

# clear catalog if necessary
if hadoop fs -test -e $CATALOG_PATH ; then
  hadoop fs -rmr /user/$USER/.lingual
fi	

#-------------------------------------------------------------------------------------------------------------------------------------

# initialize lingual catalog
lingual catalog --init
# create cascading-jdbc-redshift provider
lingual catalog --provider --add ${CASCADING_JDBC_PATH} --showstacktrace
# view provider
#lingual catalog --provider --show

#-------------------------------------------------------------------------------------------------------------------------------------

# create IN schema to read from in HDFS
lingual catalog --schema IN --add
# create stereotype and define columns and types
lingual catalog --schema IN --stereotype IN -add --columns ip,junk1,junk2,time1,offset,request,response,size --types string,string,string,string,string,string,int,int
# add format to schema
lingual catalog --schema IN --format ssv --add --provider text --extensions '.ssv' --properties "delimiter= "
# add table to schema
lingual catalog --schema IN --table IN --stereotype IN -add ${HDFS_DATA_FILES_PATH} --format ssv
# show table
lingual catalog --schema IN --table IN --show

#-------------------------------------------------------------------------------------------------------------------------------------

# create OUT schema to read from in HDFS
lingual catalog --schema OUT --add --showstacktrace
# create stereotype and define columns and types
lingual catalog --schema OUT --stereotype OUT -add --columns ip,time1,request,response,size --types string,string,string,int,int --showstacktrace
# add format to schema
lingual catalog --schema OUT --format postgresql --add --provider redshift --showstacktrace
# add protocol and table definition to schema
lingual catalog --schema OUT --protocol jdbc --add --properties="tabledesc.tablename=work_now,tabledesc.columnnames=ip:time1:request:response:size,tabledesc.columndefs=varchar(100):varchar(100):varchar(250):int:int,jdbcuser=${REDSHIFT_USER},jdbcpassword=${REDSHIFT_PASSWORD},usedirectinsert=true,sinkmode=REPLACE"  --provider redshift --showstacktrace
# add protocol format - postgresql
lingual catalog --schema OUT --protocol jdbc --format postgresql --add --provider redshift --showstacktrace
# add table to schema
lingual catalog --schema OUT --table OUT --stereotype OUT --add ${REDSHIFT_URL}  --protocol jdbc  --format postgresql --provider redshift --showstacktrace
# show table
lingual catalog --schema OUT --table OUT --show

#-------------------------------------------------------------------------------------------------------------------------------------

# migrate data using SQL from HDFS (IN) to Redshift (OUT)
echo "INSERT INTO \"OUT\".\"OUT\" SELECT \"ip\",\"time1\",\"request\",\"response\",\"size\" FROM \"IN\".\"IN\" WHERE \"response\" = 200;" | lingual shell --showstacktrace

#-------------------------------------------------------------------------------------------------------------------------------------
