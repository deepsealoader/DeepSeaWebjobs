%~d0
cd %~dp0
java -Xms256M -Xmx1024M -cp .;../lib/routines.jar;../lib/advancedPersistentLookupLib-1.2.jar;../lib/commons-collections-3.2.2.jar;../lib/dom4j-1.6.1.jar;../lib/jboss-serialization.jar;../lib/log4j-1.2.15.jar;../lib/log4j-1.2.16.jar;../lib/mongo-java-driver-3.5.0.jar;../lib/postgresql-8.3-603.jdbc3.jar;../lib/trove.jar;sat_geography_0_1.jar; deepsea.sat_geography_0_1.SAT_GEOGRAPHY  %* 