%~d0
cd %~dp0
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .;../lib/routines.jar;../lib/ant-1.10.1.jar;../lib/checkArchive-1.1-20171121.jar;../lib/commons-compress-1.10.jar;../lib/dom4j-1.6.1.jar;../lib/filecopy.jar;../lib/log4j-1.2.16.jar;../lib/talendzip.jar;../lib/zip4j_1.3.1.jar;talendjobtowebjob_0_1.jar; deepsea.talendjobtowebjob_0_1.TalendJobToWebjob  %* 