@echo off

REM This file is *not* generated by any installers.
REM It is here only as an convinience to users running from
REM the jython CVS.

set ARGS=

:loop
if [%1] == [] goto end
        set ARGS=%ARGS% %1
        shift
        goto loop
:end

rem -Xmx90mb 
java.exe -Dpython.home=%JYTHON_HOME% org.python.util.jython %ARGS%
