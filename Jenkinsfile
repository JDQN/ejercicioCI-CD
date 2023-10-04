@echo off
setlocal enabledelayedexpansion

:: Obtener el minuto actual
for /f "delims=" %%a in ('wmic os get localdatetime ^| find "."') do set datetime=%%a
set min=!datetime:~10,2!

:: Imprimir el número correspondiente al minuto actual más uno
set /a num=min+1
echo %num%

endlocal