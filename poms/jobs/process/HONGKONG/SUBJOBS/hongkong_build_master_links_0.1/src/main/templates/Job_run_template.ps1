$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' '-Dfile.encoding=UTF-8' -cp '.;../lib/routines.jar;../lib/advancedPersistentLookupLib-1.2.jar;../lib/commons-collections-3.2.2.jar;../lib/dom4j-1.6.1.jar;../lib/jboss-serialization.jar;../lib/jersey-client-1.4.jar;../lib/jersey-core-1.4.jar;../lib/log4j-1.2.15.jar;../lib/log4j-1.2.16.jar;../lib/mongo-java-driver-3.5.0.jar;../lib/postgresql-8.3-603.jdbc3.jar;../lib/talendcsv.jar;../lib/trove.jar;hongkong_build_master_links_0_1.jar;dsendexception_0_1.jar;link_master_with_multiple_without_hub_0_1.jar;link_master_with_multiple_0_1.jar;link_master_with_empty_0_1.jar;check_geography_customer_link_0_1.jar;sal_master_0_1.jar;link_master_sales_objective_0_1.jar;link_master_0_1.jar;' deepsea.hongkong_build_master_links_0_1.HONGKONG_BUILD_MASTER_LINKS  %* 