$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' -cp '.;../lib/routines.jar;../lib/activation.jar;../lib/commons-codec-1.6.jar;../lib/commons-httpclient-3.0.1.jar;../lib/commons-logging-1.1.jar;../lib/commons-logging-1.2.jar;../lib/dom4j-1.6.1.jar;../lib/httpasyncclient-4.1.1.jar;../lib/httpclient-4.5.2.jar;../lib/httpcore-4.4.4.jar;../lib/httpcore-nio-4.4.4.jar;../lib/httpmime-4.5.2.jar;../lib/jakarta-oro-2.0.8.jar;../lib/jcifs-1.3.0.jar;../lib/json-20160212.jar;../lib/log4j-1.2.16.jar;../lib/mail.jar;../lib/unirest-java-1.4.9.jar;thailand_get_sales_dksh_daily_0_1.jar;' deepsea.thailand_get_sales_dksh_daily_0_1.THAILAND_GET_SALES_DKSH_DAILY  --context=Production %* 