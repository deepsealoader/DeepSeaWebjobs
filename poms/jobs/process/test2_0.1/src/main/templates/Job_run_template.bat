%~d0
cd %~dp0
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/commons-logging-1.2.jar;../lib/dom4j-1.6.1.jar;../lib/httpasyncclient-4.1.1.jar;../lib/httpclient-4.5.2.jar;../lib/httpcore-4.4.4.jar;../lib/httpcore-nio-4.4.4.jar;../lib/httpmime-4.5.2.jar;../lib/json-20160212.jar;../lib/log4j-1.2.16.jar;../lib/unirest-java-1.4.9.jar;test2_0_1.jar; deepsea.test2_0_1.test2  %* 