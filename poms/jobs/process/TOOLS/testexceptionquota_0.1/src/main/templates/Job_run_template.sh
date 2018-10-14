#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/accessors-smart-1.1.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/jersey-client-1.4.jar:$ROOT_PATH/../lib/jersey-core-1.4.jar:$ROOT_PATH/../lib/json-path-2.1.0.jar:$ROOT_PATH/../lib/json-smart-2.2.1.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/slf4j-api-1.7.5.jar:$ROOT_PATH/../lib/slf4j-log4j12-1.7.5.jar:$ROOT_PATH/testexceptionquota_0_1.jar: deepsea.testexceptionquota_0_1.TestExceptionQuota  "$@" 