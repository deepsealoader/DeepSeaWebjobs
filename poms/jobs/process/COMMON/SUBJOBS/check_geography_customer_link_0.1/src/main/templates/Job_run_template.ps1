$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' '-Dfile.encoding=UTF-8' -cp '.;../lib/routines.jar;../lib/advancedPersistentLookupLib-1.2.jar;../lib/commons-collections-3.2.2.jar;../lib/dom4j-1.6.1.jar;../lib/jboss-serialization.jar;../lib/jersey-client-1.4.jar;../lib/jersey-core-1.4.jar;../lib/log4j-1.2.15.jar;../lib/log4j-1.2.16.jar;../lib/mongo-java-driver-3.5.0.jar;../lib/postgresql-8.3-603.jdbc3.jar;../lib/trove.jar;check_geography_customer_link_0_1.jar;dsendexception_0_1.jar;' deepsea.check_geography_customer_link_0_1.CHECK_GEOGRAPHY_CUSTOMER_LINK  %* 