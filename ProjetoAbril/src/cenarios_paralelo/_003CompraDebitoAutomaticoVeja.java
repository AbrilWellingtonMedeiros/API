package cenarios_paralelo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import grid_paralelo.SuperClass;
import grid_paralelo.AbrilUtilsParalelo;
import grid_paralelo.TLDriverFactory;

public class _003CompraDebitoAutomaticoVeja extends SuperClass  {


	@Test
	public void _003_CompraDebitoAutomaticoVeja() throws Exception {

		WebDriver driver = TLDriverFactory.getDriver();

		/**********************
		 * Teste
		 ********************/
		acessarUrlProd(driver);	
		//AceitoLGPD(driver);
		//VerOfertasVeja(driver);
//		Assine();
//		EscolhaPlano();// default Anual
//		DadosIdentificacao();
//		EscolhaDebitoConta();
//		PreencheDebitoConta();
//		FecharCompra();
//		validacao();

		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
		 * relatório.
		 ************************************************/
		//adicionaImagemLogSucessoRelatorio("Evidência de Teste:");

	}
	
//	@Test
//	public void _003_CompraDebitoAutomaticoVeja2() throws Exception {
//
//		WebDriver driver = TLDriverFactory.getDriver();
//
//		/**********************
//		 * Teste
//		 ********************/
//		acessarUrlProd(driver);	
//		//AceitoLGPD(driver);
//		
//
//	}
	
	
}

