%~d0
cd %~dp0
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/jxl.jar;../lib/log4j-1.2.16.jar;test1_0_1.jar; deepsea.test1_0_1.test1  %* 