@echo off

set ANT_OPTS=-Xmx512M

set DBFLUTE_HOME=..\mydbflute\dbflute-1.2.6

set MY_PROPERTIES_PATH=build.properties

if "%pause_at_end%"=="" set pause_at_end=y
