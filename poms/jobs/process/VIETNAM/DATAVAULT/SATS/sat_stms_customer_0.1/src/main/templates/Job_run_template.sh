#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/advancedPersistentLookupLib-1.2.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/jboss-serialization.jar:$ROOT_PATH/../lib/log4j-1.2.15.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/mssql-jdbc.jar:$ROOT_PATH/../lib/talend_DB_mssqlUtil-1.2-20171017.jar:$ROOT_PATH/../lib/trove.jar:$ROOT_PATH/sat_stms_customer_0_1.jar: deepsea.sat_stms_customer_0_1.SAT_STMS_CUSTOMER  "$@" 