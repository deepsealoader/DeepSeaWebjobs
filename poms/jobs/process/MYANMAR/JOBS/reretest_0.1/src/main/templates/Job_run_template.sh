#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/advancedPersistentLookupLib-1.2.jar:$ROOT_PATH/../lib/commons-codec-1.6.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/commons-collections4-4.1.jar:$ROOT_PATH/../lib/commons-httpclient-3.0.1.jar:$ROOT_PATH/../lib/commons-lang-2.6.jar:$ROOT_PATH/../lib/commons-lang3-3.6.jar:$ROOT_PATH/../lib/commons-logging-1.1.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/geronimo-stax-api_1.0_spec-1.0.1.jar:$ROOT_PATH/../lib/jboss-serialization.jar:$ROOT_PATH/../lib/jcifs-1.3.0.jar:$ROOT_PATH/../lib/jersey-client-1.4.jar:$ROOT_PATH/../lib/jersey-core-1.4.jar:$ROOT_PATH/../lib/log4j-1.2.15.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/mongo-java-driver-3.5.0.jar:$ROOT_PATH/../lib/poi-3.16-20170419_modified_talend.jar:$ROOT_PATH/../lib/poi-ooxml-3.16-20170419_modified_talend.jar:$ROOT_PATH/../lib/poi-ooxml-schemas-3.16-20170419.jar:$ROOT_PATH/../lib/poi-scratchpad-3.16-20170419.jar:$ROOT_PATH/../lib/postgresql-8.3-603.jdbc3.jar:$ROOT_PATH/../lib/talendExcel-1.3-20180215.jar:$ROOT_PATH/../lib/trove.jar:$ROOT_PATH/../lib/xmlbeans-2.6.0.jar:$ROOT_PATH/reretest_0_1.jar:$ROOT_PATH/dsendexception_0_1.jar:$ROOT_PATH/sat_sales_0_1.jar:$ROOT_PATH/myanmar_build_sales_links_0_1.jar:$ROOT_PATH/myanmar_generate_customer_diff_0_1.jar:$ROOT_PATH/hub_sales_0_1.jar:$ROOT_PATH/link_sales_0_1.jar: deepsea.reretest_0_1.reretest  "$@" 