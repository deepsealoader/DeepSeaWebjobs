$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' -cp '.;../lib/routines.jar;../lib/advancedPersistentLookupLib-1.2.jar;../lib/commons-collections-3.2.2.jar;../lib/commons-lang-2.6.jar;../lib/dom4j-1.6.1.jar;../lib/jboss-serialization.jar;../lib/jersey-client-1.4.jar;../lib/jersey-core-1.4.jar;../lib/log4j-1.2.15.jar;../lib/log4j-1.2.16.jar;../lib/mongo-java-driver-3.5.0.jar;../lib/postgresql-8.3-603.jdbc3.jar;../lib/talendcsv.jar;../lib/trove.jar;build_master_sats_0_1.jar;sat_product_0_1.jar;sat_market_0_1.jar;dsendexception_0_1.jar;sat_employee_0_1.jar;sat_source_channel_0_1.jar;sat_customer_0_1.jar;sat_sales_objective_0_1.jar;sat_organization_0_1.jar;sat_geography_0_1.jar;' deepsea.build_master_sats_0_1.BUILD_MASTER_SATS  %* 