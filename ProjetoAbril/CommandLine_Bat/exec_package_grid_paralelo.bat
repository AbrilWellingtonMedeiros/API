cd C:\Users\swtest\.jenkins\workspace\Automacao\ProjetoAbril
set ProjectPath=C:\Users\swtest\.jenkins\workspace\Automacao\ProjetoAbril
set ftor=C:\Users\swtest\.jenkins\workspace\Automacao\ProjetoAbril\bin\grid_paralelo
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\utilitarios\libs\*
echo %classpath%
java org.testng.TestNG -log 100 %ftor%\testng_paralelo.xml

