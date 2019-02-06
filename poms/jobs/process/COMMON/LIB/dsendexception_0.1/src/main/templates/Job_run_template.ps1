$fileDir = Split-Path -Parent $MyInvocation.MyCommand.Path
cd $fileDir
java '-Xms256M' '-Xmx1024M' -cp '.;../lib/routines.jar;../lib/dom4j-1.6.1.jar;../lib/jersey-client-1.4.jar;../lib/jersey-core-1.4.jar;../lib/log4j-1.2.16.jar;dsendexception_0_1.jar;' deepsea.dsendexception_0_1.dSendException  %* 