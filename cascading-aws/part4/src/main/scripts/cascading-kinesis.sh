#!/bin/bash -ex

REDSHIFT_URL=$1
REDSHIFT_USER=$2
REDSHIFT_PASSWORD=$3
BUCKET=$4
AWS_ACCESS_KEY=$5
AWS_SECRET_KEY=$6

NAME=CascadingKinesis-1.0.jar
BUILD=build/libs
DATA_DIR=data/hashjoin_sample.csv

# Uncomment to use Driven - http://cascading.io/download-driven-server/
#DRIVEN_API_KEY="<YOUR-DRIVEN-API-KEY>"
#DRIVEN_VERSION="1.2"
#INSTALL_PLUGIN_URL="s3://files.concurrentinc.com/driven/${DRIVEN_VERSION}/driven-plugin/install-driven-plugin.sh"
#DRIVEN_SERVER_HOSTS="<YOUR-DRIVEN-SERVER-HOST:8080>"

# clean and build part 4 application
gradle clean fatjar

# create the bucket or delete the contents if it exists
aws s3 mb s3://$BUCKET || aws s3 rm s3://$BUCKET --recursive

# push built jar file to S3
aws s3 cp $BUILD/$NAME s3://$BUCKET/$NAME
# push data file to S3 - we will join this file against the Kinesis stream
aws s3 cp $DATA_DIR s3://$BUCKET/$DATA_DIR

# EMR instance type and count
INSTANCE_TYPE="m1.xlarge"
INSTANCE_COUNT="1"

# uncomment and add the following to elastic-mapreduce call below if using driven
# --bootstrap-actions Path=$INSTALL_PLUGIN_URL,Name=DRIVEN_BOOTSTRAP,Args="--host,${DRIVEN_SERVER_HOSTS}","--api-key,${DRIVEN_API_KEY}" \

aws emr create-cluster \
  --ami-version 3.7.0 \
  --instance-type $INSTANCE_TYPE \
  --instance-count $INSTANCE_COUNT \
  --name "cascading-kinesis-example" \
  --visible-to-all-users \
  --enable-debugging \
  --auto-terminate \
  --no-termination-protected \
  --log-uri s3n://$BUCKET/logs/ \
  --service-role EMR_DefaultRole --ec2-attributes InstanceProfile=EMR_EC2_DefaultRole \
  --steps Type=CUSTOM_JAR,Name=KinesisTest1,ActionOnFailure=TERMINATE_CLUSTER,Jar=s3n://$BUCKET/$NAME,Args=$REDSHIFT_URL,$REDSHIFT_USER,$REDSHIFT_PASSWORD,$AWS_ACCESS_KEY,$AWS_SECRET_KEY,$BUCKET

# to run this job as a step on an existing cluster use the following command rather than create-cluster above
#aws emr add-steps --cluster-id <YOUR_CLUSTER_ID> --steps Type=CUSTOM_JAR,Properties="cascading.management.document.service.apikey=$DRIVEN_API_KEY",Name=Kinesis1,ActionOnFailure=CONTINUE,Jar=s3://$BUCKET/$NAME,Args=$REDSHIFT_URL,$REDSHIFT_USER,$REDSHIFT_PASSWORD,$AWS_ACCESS_KEY,$AWS_SECRET_KEY,$BUCKET