$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' -cp '.;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.16.jar;../lib/mongo-java-driver-3.5.0.jar;extract_customer_sector_0_1.jar;' deepsea.extract_customer_sector_0_1.EXTRACT_CUSTOMER_SECTOR  --context=Production %* 