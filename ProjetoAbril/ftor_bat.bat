cd C:\Users\a515360\git\automated-tests\ProjetoExemplo
set ProjectPath=C:\Users\a515360\git\automated-tests\ProjetoExemplo
set ftor=C:\Users\a515360\git\automated-tests\ProjetoExemplo\bin\grid_paralelo\
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\libs\*
echo %classpath%
java org.testng.TestNG -log 100 %ftor%\testng_paralelo.xml
pause