package ftor_testng;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*********************************************************************************
 * Superclasse -> Classe responsï¿½vel pela implementaï¿½ï¿½o dos
 * mï¿½todos referentes ï¿½ tela de resultado da consulta por preï¿½o e
 * prazo de entrega que posteriormente serï¿½o chamados dentro dos casos de
 * teste.
 *********************************************************************************/

public class Indexados_Utils extends Utils {

	public void AcessarURLIndexados() throws Exception {
		acessarURL(DataDriven_Indexados.UrlStory);
		
	 clicarElemento(By.xpath("//*[@id='post-3999229']/div/div[1]/a"), "site");
		pausar(2000);
		//voltarTelaAnterior();
		
		//teste 1
		
		//redirecionaSite(By.xpath("//*[@id='post-3999229']/div/div[1]/a"), "Site.");
		
		//teste 2
		
		alterarJanelaPorURLSite("site:https://veja.abril.com.br/amp-story/3-formas-de-meditar-para-combater-stress/");
	
			
			
			
			
//
//			driver.findElement(By.xpath("//*[@id='post-3991330']/div/div[1]/a/h2")).click();
//			pausar(2000);
//			voltarTelaAnterior();	
			
			    
			
			// Criar metodo de varredura non Dom e armazenar todas as ahref, dai com elas armazenadas 
			//vou add site: e chamar elas, concatenar a chamada e acessar
			//validar se esta indexada ou nao 
			// relatorios

		// voltei p home
		
		

		}
}

		
		
		
		
		
		
		
		
		
		
		
	
