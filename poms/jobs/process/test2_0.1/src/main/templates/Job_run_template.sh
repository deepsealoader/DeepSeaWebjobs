#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/commons-logging-1.2.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/httpasyncclient-4.1.1.jar:$ROOT_PATH/../lib/httpclient-4.5.2.jar:$ROOT_PATH/../lib/httpcore-4.4.4.jar:$ROOT_PATH/../lib/httpcore-nio-4.4.4.jar:$ROOT_PATH/../lib/httpmime-4.5.2.jar:$ROOT_PATH/../lib/json-20160212.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/unirest-java-1.4.9.jar:$ROOT_PATH/test2_0_1.jar: deepsea.test2_0_1.test2  "$@" 