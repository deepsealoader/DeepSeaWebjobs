#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -Dfile.encoding=UTF-8 -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/ant-1.10.1.jar:$ROOT_PATH/../lib/checkArchive-1.1-20171121.jar:$ROOT_PATH/../lib/commons-compress-1.10.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/filecopy.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/talendzip.jar:$ROOT_PATH/../lib/zip4j_1.3.1.jar:$ROOT_PATH/talendjobtowebjob_0_1.jar: deepsea.talendjobtowebjob_0_1.TalendJobToWebjob  "$@" 