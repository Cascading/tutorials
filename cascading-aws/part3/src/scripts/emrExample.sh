#!/bin/bash -ex

REDSHIFT_URL=$1
REDSHIFT_USER=$2
REDSHIFT_PASSWORD=$3
BUCKET=$4
AWS_ACCESS_KEY=$5
AWS_SECRET_KEY=$6

# Uncomment to use Driven
#DRIVEN_API_KEY=$7
#DRIVEN_VERSION="1.2"
#INSTALL_PLUGIN_URL="s3://wip.concurrentinc.com/driven/${DRIVEN_VERSION}/driven-plugin/install-driven-plugin.sh"
#DRIVEN_SERVER_HOSTS="https://driven.cascading.io"

INSTANCE_TYPE="m1.xlarge"
INSTANCE_COUNT="3"

# uncomment and add the following to elastic-mapreduce call below if using driven
#--bootstrap-action $INSTALL_PLUGIN_URL --args "--host,${DRIVEN_SERVER_HOSTS},--api-key,${DRIVEN_API_KEY}" \

elastic-mapreduce  --create --name "cascading-aws-tutorial-3" \
  --visible-to-all-users \
  --num-instances $INSTANCE_COUNT \
  --slave-instance-type $INSTANCE_TYPE \
  --master-instance-type $INSTANCE_TYPE \
  --debug \
  --enable-debugging \
  --jar s3n://$BUCKET/$NAME \
  --arg $REDSHIFT_URL \
  --arg $REDSHIFT_USER \
  --arg $REDSHIFT_PASSWORD \
  --arg $AWS_ACCESS_KEY \
  --arg $AWS_SECRET_KEY \
  --arg $BUCKET