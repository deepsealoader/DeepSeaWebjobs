$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' -cp '.;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.16.jar;myanmar_build_sales_vault_0_1.jar;dsendexception_0_1.jar;sat_sales_0_1.jar;myanmar_build_sales_links_0_1.jar;myanmar_generate_customer_diff_0_1.jar;hub_sales_0_1.jar;link_sales_0_1.jar;' deepsea.myanmar_build_sales_vault_0_1.MYANMAR_BUILD_SALES_VAULT  --context=Production %* 