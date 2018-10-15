#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/advancedPersistentLookupLib-1.2.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/commons-lang-2.6.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/jboss-serialization.jar:$ROOT_PATH/../lib/jersey-client-1.4.jar:$ROOT_PATH/../lib/jersey-core-1.4.jar:$ROOT_PATH/../lib/log4j-1.2.15.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/mongo-java-driver-3.5.0.jar:$ROOT_PATH/../lib/postgresql-8.3-603.jdbc3.jar:$ROOT_PATH/../lib/talendcsv.jar:$ROOT_PATH/../lib/trove.jar:$ROOT_PATH/build_sales_vault_0_1.jar:$ROOT_PATH/dsendexception_0_1.jar:$ROOT_PATH/link_sales_geography_0_1.jar:$ROOT_PATH/sat_sales_0_1.jar:$ROOT_PATH/check_schema_0_1.jar:$ROOT_PATH/build_sales_links_0_1.jar:$ROOT_PATH/hub_sales_0_1.jar:$ROOT_PATH/link_sales_0_1.jar: deepsea.build_sales_vault_0_1.BUILD_SALES_VAULT  --context=Production "$@" 