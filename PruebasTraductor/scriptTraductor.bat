@echo off
for %%f in (*.for) do call :exe %%f
goto end

:exe
set input=%1
call set output=%input:for=c%
java -jar FortranToC.jar %input% > %output%

:end