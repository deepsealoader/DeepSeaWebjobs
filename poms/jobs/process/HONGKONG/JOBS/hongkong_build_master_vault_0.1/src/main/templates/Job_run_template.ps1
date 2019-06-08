$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' -cp '.;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/log4j-1.2.16.jar;hongkong_build_master_vault_0_1.jar;sat_market_0_1.jar;dsendexception_0_1.jar;hub_master_sales_objectives_0_1.jar;hongkong_build_master_links_0_1.jar;link_master_with_multiple_without_hub_0_1.jar;sat_customer_0_1.jar;sat_sales_objective_0_1.jar;link_master_with_multiple_0_1.jar;check_geography_customer_link_0_1.jar;hub_master_0_1.jar;sal_master_0_1.jar;link_master_sales_objective_0_1.jar;sat_geography_0_1.jar;link_master_0_1.jar;sat_product_0_1.jar;sat_employee_0_1.jar;sat_source_channel_0_1.jar;hongkong_build_master_sats_0_1.jar;sat_organization_0_1.jar;link_master_with_empty_0_1.jar;hub_master_with_duplicates_0_1.jar;hongkong_build_master_hubs_0_1.jar;sal_master_with_empty_0_1.jar;' deepsea.hongkong_build_master_vault_0_1.HONGKONG_BUILD_MASTER_VAULT  --context=Production %* 