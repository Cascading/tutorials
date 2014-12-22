#!/bin/bash -ex

REDSHIFT_URL=$1
REDSHIFT_USER=$2
REDSHIFT_PASSWORD=$3
BUCKET=$4
AWS_ACCESS_KEY=$5
AWS_SECRET_KEY=$6

NAME=cascading-aws-tutorials.jar
BUILD=part3/build/libs

# Uncomment to use Driven
#DRIVEN_API_KEY=[YOUR DRIVEN API KEY]
#DRIVEN_VERSION="1.2"
#INSTALL_PLUGIN_URL="s3://wip.concurrentinc.com/driven/${DRIVEN_VERSION}/driven-plugin/install-driven-plugin.sh"
#DRIVEN_SERVER_HOSTS="https://driven.cascading.io"

# clean and build part 3 application
gradle :part3:clean :part3:jar

# create the bucket or delete the contents if it exists
aws s3 mb s3://$BUCKET || aws s3 rm s3://$BUCKET --recursive

# push required data files to S3
aws s3 cp cascading-aws-data/date_dim.dat s3://$BUCKET/cascading-aws-data/
aws s3 cp cascading-aws-data/store_sales.dat s3://$BUCKET/cascading-aws-data/
aws s3 cp cascading-aws-data/item.dat s3://$BUCKET/cascading-aws-data/
aws s3 cp cascading-aws-data/store.dat s3://$BUCKET/cascading-aws-data/
aws s3 cp cascading-aws-data/customer_demographics.dat s3://$BUCKET/cascading-aws-data/

# push built jar file to S3
aws s3 cp $BUILD/$NAME s3://$BUCKET/$NAME

# EMR instance type and count
INSTANCE_TYPE="m1.xlarge"
INSTANCE_COUNT="3"

# uncomment and add the following to elastic-mapreduce call below if using driven
# --bootstrap-actions Path=$INSTALL_PLUGIN_URL,Name=DRIVEN_BOOTSTRAP,Args="--host,${DRIVEN_SERVER_HOSTS}","--api-key,${DRIVEN_API_KEY}" \

aws emr create-cluster \
  --ami-version 3.3.1 \
  --instance-type $INSTANCE_TYPE \
  --instance-count $INSTANCE_COUNT \
  --name "cascading-aws-tutorial-3" \
  --visible-to-all-users \
  --enable-debugging \
  --auto-terminate \
  --no-termination-protected \
  --log-uri s3n://$BUCKET/logs/ \
  --steps Type=CUSTOM_JAR,Name=Part3,ActionOnFailure=TERMINATE_CLUSTER,Jar=s3n://$BUCKET/$NAME,Args=$REDSHIFT_URL,$REDSHIFT_USER,$REDSHIFT_PASSWORD,$AWS_ACCESS_KEY,$AWS_SECRET_KEY,$BUCKET
