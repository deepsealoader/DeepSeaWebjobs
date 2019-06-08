#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/hongkong_build_master_vault_0_1.jar:$ROOT_PATH/sat_market_0_1.jar:$ROOT_PATH/dsendexception_0_1.jar:$ROOT_PATH/hub_master_sales_objectives_0_1.jar:$ROOT_PATH/hongkong_build_master_links_0_1.jar:$ROOT_PATH/link_master_with_multiple_without_hub_0_1.jar:$ROOT_PATH/sat_customer_0_1.jar:$ROOT_PATH/sat_sales_objective_0_1.jar:$ROOT_PATH/link_master_with_multiple_0_1.jar:$ROOT_PATH/check_geography_customer_link_0_1.jar:$ROOT_PATH/hub_master_0_1.jar:$ROOT_PATH/sal_master_0_1.jar:$ROOT_PATH/link_master_sales_objective_0_1.jar:$ROOT_PATH/sat_geography_0_1.jar:$ROOT_PATH/link_master_0_1.jar:$ROOT_PATH/sat_product_0_1.jar:$ROOT_PATH/sat_employee_0_1.jar:$ROOT_PATH/sat_source_channel_0_1.jar:$ROOT_PATH/hongkong_build_master_sats_0_1.jar:$ROOT_PATH/sat_organization_0_1.jar:$ROOT_PATH/link_master_with_empty_0_1.jar:$ROOT_PATH/hub_master_with_duplicates_0_1.jar:$ROOT_PATH/hongkong_build_master_hubs_0_1.jar:$ROOT_PATH/sal_master_with_empty_0_1.jar: deepsea.hongkong_build_master_vault_0_1.HONGKONG_BUILD_MASTER_VAULT  --context=Production "$@" 