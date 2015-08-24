#!/bin/bash

# Copyright (c) 2007-2015 Concurrent, Inc. All Rights Reserved.
#
#  Project and contact information: http://www.cascading.org/
#
#  This file is part of the Cascading project.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

echo "Starting Setup"

# Please define a username for Redshift
REDSHIFT_USER_NAME=
#Please define a password for Redshift
REDSHIFT_PASSWORD=

# Create Kinesis stream for sample
echo "*** Creating Kinesis Stream ***"
aws kinesis create-stream --stream-name AccessLogStream --shard-count 2

# Create DynamoDb table required by EMR to process Kinesis
echo "*** Creating DynamoDb Table ***"
aws dynamodb create-table --table-name MyEMRKinesisTable --attribute-definitions AttributeName=HashKey,AttributeType=S AttributeName=RangeKey,AttributeType=S --key-schema AttributeName=HashKey,KeyType=HASH AttributeName=RangeKey,KeyType=RANGE --provisioned-throughput ReadCapacityUnits=10,WriteCapacityUnits=10

# Create DynamoDb table to maintain iterations on Kinesis processing by EMR
echo "*** Creating DynamoDb Iteration Table ***"
aws dynamodb create-table --table-name MyEMRKinesisTableIteration --attribute-definitions AttributeName=Hash,AttributeType=S  --key-schema AttributeName=Hash,KeyType=HASH --provisioned-throughput ReadCapacityUnits=1,WriteCapacityUnits=1

# Create basic Redshift DB where we will sink our results\
echo "*** Creating Redshift Database ***"
aws redshift create-cluster --node-type dc1.large --number-of-nodes 2 --master-username $REDSHIFT_USER_NAME --master-user-password $REDSHIFT_PASSWORD --cluster-identifier mycluster

# Download sample kinesis stream appender
echo "*** Downloading publisher/kinesis-log4j-appender-1.0.0.jar ***"
wget http://emr-kinesis.s3.amazonaws.com/publisher/kinesis-log4j-appender-1.0.0.jar

# Download sample access logs
echo "*** Downloading kinesis_sample_data.tar.gz ***"
wget wget http://data.cascading.org/kinesis_sample_data.tar.gz

# Unpack sample data
echo "*** Unpacking kinesis_sample_data.tar.gz ***"
tar -xvf kinesis_sample_data.tar.gz

# wait for Kinesis stream to be ready
echo "*** Waiting 30 seconds for Kinesis stream to be ready  - Please do not kill this process ***"
sleep 30

# Start Amazon Kinesis Publisher for One-Time Publishing
echo "*** Publishing sample data to Kinesis ***"
java -cp .:kinesis-log4j-appender-1.0.0.jar com.amazonaws.services.kinesis.log4j.FilePublisher kinesis_sample_data/access_log.txt

echo "*** Setup complete ***"