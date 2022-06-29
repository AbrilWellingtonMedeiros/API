package cenarios;


import org.testng.annotations.Test;

import ftor_testng.AbrilUtils;
import ftor_testng.ConfigureExecution;


public class _030APIVejabkp extends  AbrilUtils {

	// Caso de Teste

	@Test 
	public void APIVeja() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("030");
	}

	// M�todo de Teste
	public void test030APIVeja() throws Exception {

		/**********************
		 * Teste
		 ********************/
		//acessarURLAPIVEJA();
		gerarRelatorioPDFSucesso();
		ConverterResponseBodyVeja();
		

		/************************************************
		 * -->Adiciona imagem ao relat�rio ExtentReports; 
		 * -->Finaliza o relat�rio.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evid�ncia de Teste:");
		
		

		
	}
	

}
