$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' '-Dfile.encoding=UTF-8' -cp '.;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.16.jar;../lib/mssql-jdbc.jar;../lib/talend_DB_mssqlUtil-1.2-20171017.jar;hub_stms_customer_0_1.jar;' deepsea.hub_stms_customer_0_1.HUB_STMS_CUSTOMER  %* 