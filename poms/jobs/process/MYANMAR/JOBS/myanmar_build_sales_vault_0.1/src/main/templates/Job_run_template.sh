#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/myanmar_build_sales_vault_0_1.jar:$ROOT_PATH/dsendexception_0_1.jar:$ROOT_PATH/sat_sales_0_1.jar:$ROOT_PATH/myanmar_build_sales_links_0_1.jar:$ROOT_PATH/myanmar_generate_customer_diff_0_1.jar:$ROOT_PATH/hub_sales_0_1.jar:$ROOT_PATH/link_sales_0_1.jar: deepsea.myanmar_build_sales_vault_0_1.MYANMAR_BUILD_SALES_VAULT  --context=Production "$@" 