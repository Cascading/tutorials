#!/bin/bash -ex

REDSHIFT_URL=$1
REDSHIFT_USER=$2
REDSHIFT_PASSWORD=$3
BUCKET=$4
AWS_ACCESS_KEY=$5
AWS_SECRET_KEY=$6

# application jar name
NAME=cascading-aws-tutorials.jar

# application jar path
BUILD=part2/build/libs

# clean and build part 2 application
gradle :part2:clean :part2:jar

# create the bucket or delete the contents if it exists
aws s3 mb s3://$BUCKET || aws s3 rm s3://$BUCKET --recursive

# create tmp bucket or delete the contents if it exists
aws s3 mb s3://$BUCKET/tmp || aws s3 rm s3://$BUCKET/tmp --recursive

# push required data files to S3
aws s3 cp data/date_dim.dat s3://$BUCKET/
aws s3 cp data/store_sales.dat s3://$BUCKET/
aws s3 cp data/item.dat s3://$BUCKET/

# push built jar file to S3
aws s3 cp $BUILD/$NAME s3://$BUCKET/$NAME

# EMR instance type and count
INSTANCE_TYPE="m1.xlarge"
INSTANCE_COUNT="3"

# lingual bootstrap url
INSTALL_SDK_URL="s3://files.cascading.org/sdk/2.6/install-cascading-sdk.sh"

aws emr create-cluster \
  --ami-version 3.3.1 \
  --instance-type $INSTANCE_TYPE \
  --instance-count $INSTANCE_COUNT \
  --bootstrap-actions Path=$INSTALL_SDK_URL,Name=SDK_LINGUAL_BOOTSTRAP \
  --name "cascading-aws-tutorial-2" \
  --visible-to-all-users \
  --enable-debugging \
  --auto-terminate \
  --no-termination-protected \
  --log-uri s3n://$BUCKET/logs/ \
  --steps Type=CUSTOM_JAR,Name=Part2,ActionOnFailure=TERMINATE_CLUSTER,Jar=s3n://$BUCKET/$NAME,Args=$REDSHIFT_URL,$REDSHIFT_USER,$REDSHIFT_PASSWORD,$AWS_ACCESS_KEY,$AWS_SECRET_KEY,$BUCKET
