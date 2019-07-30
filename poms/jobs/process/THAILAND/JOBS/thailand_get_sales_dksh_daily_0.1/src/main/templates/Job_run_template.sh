#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/activation.jar:$ROOT_PATH/../lib/commons-codec-1.6.jar:$ROOT_PATH/../lib/commons-httpclient-3.0.1.jar:$ROOT_PATH/../lib/commons-logging-1.1.jar:$ROOT_PATH/../lib/commons-logging-1.2.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/httpasyncclient-4.1.1.jar:$ROOT_PATH/../lib/httpclient-4.5.2.jar:$ROOT_PATH/../lib/httpcore-4.4.4.jar:$ROOT_PATH/../lib/httpcore-nio-4.4.4.jar:$ROOT_PATH/../lib/httpmime-4.5.2.jar:$ROOT_PATH/../lib/jakarta-oro-2.0.8.jar:$ROOT_PATH/../lib/jcifs-1.3.0.jar:$ROOT_PATH/../lib/json-20160212.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/mail.jar:$ROOT_PATH/../lib/unirest-java-1.4.9.jar:$ROOT_PATH/thailand_get_sales_dksh_daily_0_1.jar: deepsea.thailand_get_sales_dksh_daily_0_1.THAILAND_GET_SALES_DKSH_DAILY  --context=Production "$@" 