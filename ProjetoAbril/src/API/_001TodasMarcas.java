package API;


import org.testng.annotations.Test;
import ftor_testng.AbrilUtils;
import ftor_testng.ConfigureExecution;


public class _001TodasMarcas extends  AbrilUtils {

	// Caso de Teste

	@Test 
	public void TodasMarcas1() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("001");
	}

	// M�todo de Teste
	public void test001TodasMarcas() throws Exception {

		/**********************
		 * Teste
		 ********************/
		
		ConverterResponseBodyVeja();
	
		

		/************************************************
		 * -->Adiciona imagem ao relat�rio ExtentReports; 
		 * -->Finaliza o relat�rio.
		 ************************************************/
		//adicionaImagemLogSucessoRelatorio("Evid�ncia de Teste:");
		
		

		
	}
	

}
