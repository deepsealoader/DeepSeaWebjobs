#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/advancedPersistentLookupLib-1.2.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/jboss-serialization.jar:$ROOT_PATH/../lib/jersey-client-1.4.jar:$ROOT_PATH/../lib/jersey-core-1.4.jar:$ROOT_PATH/../lib/log4j-1.2.15.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/mongo-java-driver-3.5.0.jar:$ROOT_PATH/../lib/postgresql-8.3-603.jdbc3.jar:$ROOT_PATH/../lib/talendcsv.jar:$ROOT_PATH/../lib/trove.jar:$ROOT_PATH/thailand_build_master_links_0_1.jar:$ROOT_PATH/dsendexception_0_1.jar:$ROOT_PATH/link_master_with_multiple_without_hub_0_1.jar:$ROOT_PATH/link_master_with_multiple_0_1.jar:$ROOT_PATH/link_master_with_empty_0_1.jar:$ROOT_PATH/check_geography_customer_link_0_1.jar:$ROOT_PATH/link_master_sales_objective_0_1.jar:$ROOT_PATH/sal_master_0_1.jar:$ROOT_PATH/link_master_0_1.jar: deepsea.thailand_build_master_links_0_1.THAILAND_BUILD_MASTER_LINKS  "$@" 