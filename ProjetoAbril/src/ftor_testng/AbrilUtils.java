package ftor_testng;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import com.relevantcodes.extentreports.LogStatus;

import cenarios._012EnviarEmailbkp;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

/*********************************************************************************
 * Superclasse -> Classe responsável pela implementação dos métodos referentes a
 * tela de resultado da consulta posteriormente serão chamados dentro dos casos
 * de teste.
 *********************************************************************************/
public class AbrilUtils extends Utils {

	/****
	 * 
	 * 
	 * 
	 * INFORMAÇÕES DE URLS
	 * 
	 *
	 * 
	 */
	public void acessarURLAPIVEJA() throws Exception {
		acessarURL(DataDriven.urlapi);
	}

	public void ConverterResponseBodyVeja() throws Exception {

		gerarRelatorioPDFSucesso();

	}

	public void ConverterResponseBodyUtilVeja() throws Exception {

		// Adiciona o relatório .pdf de sucesso
		// gerarRelatorioPDFSucesso();
	}

	// API
	// Converter
	public void ConverterResponseBodyUtilVejabkp() throws Exception {

		// Converter ResponseBody em String

		String responseBody = given().when()
				// .get("https://veja.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=14-04-2022")
				.get("https://veja.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=14-04-2022")
				.getBody().asString();

		// System.out.println(responseBody);

		JSONObject jsonObject = new JSONObject(responseBody);
		Integer postsEncontrados = !jsonObject.has("Posts encontrados") || jsonObject.isNull("Posts encontrados") ? 0
				: jsonObject.getInt("Posts encontrados");

		String abertos = !jsonObject.has("Abertos") || jsonObject.isNull("Abertos") ? "0"
				: jsonObject.getString("Abertos");

		String contabilizados = !jsonObject.has("Contabilizados") || jsonObject.isNull("Contabilizados") ? "0"
				: jsonObject.getString("Contabilizados");

		String fechados = !jsonObject.has("Fechados") || jsonObject.isNull("Fechados") ? "0"
				: jsonObject.getString("Fechados");

		// saidas
		System.out.println("Posts encontrados: " + postsEncontrados);
		System.out.println("Abertos: " + abertos);
		System.out.println("Contabilizados: " + contabilizados);
		System.out.println("Fechados: " + fechados);

		// VALIDAÇÃO contabilizados

		if (Double.parseDouble(contabilizados.replace("%", "").replace(",", ".")) > 5.00) {
			logSucesso("contabilizados é maior > 5.00 = " + contabilizados);
			// logSucesso("contabilizados é menor < 5.00 = " + contabilizados);
			// System.out.println("contabilizados > 2.00 Enviando email");

		}

		else {

			// Log4j
			Logger log = Logger.getLogger(getClass());
			log.error("contabilizados é menor < 5.00 = " + contabilizados);
			// log.error("contabilizados é maior < 5.00 = " + contabilizados);

			// (Extent Reports) -> Adiciona screenshot ao relatório
			String imagem = Utils.screenShot(DataDriven.nomeCaso);

			// logger.log(LogStatus.FAIL,"Contabilizados é menor < 5 = " +
			// contabilizados + logger.addScreenCapture(imagem));

			// logger.log(LogStatus.FAIL, "Contabilizados é menor < 5 = " +
			// contabilizados + logger.addScreenCapture(imagem));

			logger.log(LogStatus.FAIL, "Contabilizados é menor < 5 = " + contabilizados);

			// Finaliza o teste
			report.endTest(logger);

			// Acrescenta o arquivo HTML com todos os testes finalizados
			report.flush();

			// Adiciona o relatório .pdf de erro
			gerarRelatorioPDFErro();

			// Envio do email
			// _012EnviarEmail email;
			// email = new _012EnviarEmail();
			// email.EnviarEmail();

		}

		// VALIDAÇÃO fechados

		if (Double.parseDouble(fechados.replace("%", "").replace(",", ".")) > 5.00) {
			// logSucesso("fechados é menor < 5.00 = " + fechados);
			logSucesso("fechados é maior > 5.00 = " + fechados);
			// System.out.println("contabilizados > 2.00 Enviando email");

		} else {

			// Log4j
			Logger log = Logger.getLogger(getClass());
			log.error("fechados é menor < 5 = " + fechados);
			// log.error("fechados é maior > 5 = " + fechados);

			// (Extent Reports) -> Adiciona screenshot ao relatório
			// String imagem = Utils.screenShot(DataDriven.nomeCaso);
			// logger.log(LogStatus.FAIL, "fechados é menor < 5 = " + fechados +
			// logger.addScreenCapture(imagem));

			// logger.log(LogStatus.FAIL, "fechados é maior < 5 = " + fechados +
			// logger.addScreenCapture(imagem));

			logger.log(LogStatus.FAIL, "fechados é maior < 5 = " + fechados);

			// Finaliza o teste
			report.endTest(logger);

			// Acrescenta o arquivo HTML com todos os testes finalizados
			report.flush();

			// Adiciona o relatório .pdf de erro
			gerarRelatorioPDFErro();

			// throw new Exception();

			// Envio do email
			// _012EnviarEmail email;
			// email = new _012EnviarEmail();
			// email.EnviarEmail();

		}
		// VALIDAÇÃO abertos

		if (Double.parseDouble(abertos.replace("%", "").replace(",", ".")) > 5.00) {
			// logSucesso("abertos é menor < 5.00 = " + abertos);
			logSucesso("abertos é maior > 5.00 = " + abertos);
			// System.out.println("contabilizados > 2.00 Enviando email");

		} else {

			// Log4j
			Logger log = Logger.getLogger(getClass());
			// log.error("abertos é maior > 5 = " + abertos);
			log.error("abertos é menor < 5 = " + abertos);

			// (Extent Reports) -> Adiciona screenshot ao relatório
			String imagem = Utils.screenShot(DataDriven.nomeCaso);

			// logger.log(LogStatus.FAIL, "abertos é maior > 5 = " + abertos +
			// logger.addScreenCapture(imagem));
			// logger.log(LogStatus.FAIL, "abertos é menor < 5 = " + abertos +
			// logger.addScreenCapture(imagem));

			logger.log(LogStatus.FAIL, "abertos é menor < 5 = " + abertos);

			// Finaliza o teste
			report.endTest(logger);

			// Acrescenta o arquivo HTML com todos os testes finalizados
			report.flush();

			// Adiciona o relatório .pdf de erro
			gerarRelatorioPDFErro();

			// Envio do email
			// _012EnviarEmail email;
			// email = new _012EnviarEmail();
			// email.EnviarEmail();

		}
	}

}
