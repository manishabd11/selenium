set projectLocation=D:\ELPC\selenium1
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG%projectLocation%\testsuit.xml
pause