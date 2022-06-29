cd C:\Users\A515360\.jenkins\workspace\API\ProjetoAbril
set suite=ProjetoAbril
echo %suite%
set ProjectPath=C:\Users\A515360\.jenkins\workspace\API\%suite%
echo %ProjectPath%
set ftor=%ProjectPath%\bin\ftor_testng
echo %ftor%
set classpath=%ProjectPath%\bin;%ProjectPath%\utilitarios\libs\*
echo %classpath%
java org.testng.TestNG -log 100 %ftor%\testng2.xml

