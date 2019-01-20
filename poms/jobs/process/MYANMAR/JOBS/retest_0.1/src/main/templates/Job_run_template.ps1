$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' '-Dfile.encoding=UTF-8' -cp '.;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.16.jar;retest_0_1.jar;dsendexception_0_1.jar;sat_sales_0_1.jar;myanmar_build_sales_links_0_1.jar;myanmar_generate_customer_diff_0_1.jar;link_sales_0_1.jar;hub_sales_0_1.jar;' deepsea.retest_0_1.retest  %* 