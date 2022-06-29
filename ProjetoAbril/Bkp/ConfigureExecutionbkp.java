package ftor_testng;

import cenarios._011Zip;
import cenarios._012EnviarEmail;
import cenarios._040Merging;
import API._030APIVeja;
import API._031APIQR;
import API._032APIVejaSP;
import API._033APIVejaRio;
import API._034APIVejaSaude;
import API._035APISuper;
import API._036APIVCSA;
import API._037APIVCRH;
import API._038APIGE;


/***************************************************************************************
 * ConfigureExecution: Classe responsável por possuir os objetos, atributos e
 * métodos de configuração da execução dos casos de teste
 ***************************************************************************************/
public class ConfigureExecutionbkp {

	// Atributos
	public static String cCaso = "";
	public static int nLin = 0;
	public static int nLin2 = 0;

	// Objetos das classes de teste
	static ReportLog reportlog = new ReportLog();

	// Objetos das classes de teste

	
	static _011Zip ct011 = new _011Zip();
	static _012EnviarEmail ct012 = new _012EnviarEmail();	
	static _030APIVeja ct030 = new _030APIVeja();
	static _031APIQR ct031 = new _031APIQR();
	static _032APIVejaSP ct032 = new _032APIVejaSP();
	static _033APIVejaRio ct033 = new _033APIVejaRio();
	static _034APIVejaSaude ct034 = new _034APIVejaSaude();
	static _035APISuper ct035 = new _035APISuper();
	static _036APIVCSA ct036 = new _036APIVCSA();
	static _037APIVCRH ct037 = new _037APIVCRH();
	static _038APIGE ct038 = new _038APIGE();
	static _040Merging ct040 = new _040Merging();

	/*********************************************************
	 * ->Seta o ID do Caso de Teste; ->Ler o CSV; ->Chama o método
	 * processarCasosTeste,referente ao Caso de Teste;
	 *********************************************************/
	public static void configurarExecucaoCasosTeste(String idCaso) throws Exception {
		switch (idCaso) {

		

		case "011":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_011Zip");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		case "012":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_012EnviarEmail");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		
		

		
			
		case "030":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_030APIVeja");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "031":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_031APIQR");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "032":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_032APIVejaSP");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "033":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_033APIVejaRio");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "034":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_034APIVejaSaude");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "035":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_035APISuper");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "036":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_036APIVCSA");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "037":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_037APIVCRH");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "038":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_038APIGE");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "040":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_040Merging");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			

		}
	}

	/****************************************************************************************
	 * ->Verifica a linha que será lida do .csv pelo Id do caso; ->Executa
	 * método 'lerRegistro' (GET do Array) com os campos do .csv; ->Inicia a
	 * gravação do relatório em vídeo; ->Realiza a chamada ao método de teste.
	 ****************************************************************************************/
	public static void processarCasosTeste(String idCaso) throws Exception {
		switch (idCaso) {

		

		case "011":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct011.Zip();
					break;
				}
			}

			break;

		case "012":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct012.main(null);
					break;
				}
			}

			break;

		
		

		
		case "030":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct030.test030APIVeja();
					break;
				}
			}

			break;
			
		case "031":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct031.test031APIQR();
					break;
				}
			}

			break;
			
		case "032":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct032.test032APIVejaSP();
					break;
				}
			}

			break;
			
		case "033":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct033.test033APIVejaRio();
					break;
				}
			}

			break;
			
		case "034":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct034.test034APIVejaSaude();
					break;
				}
			}

			break;
			
		case "035":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct035.test035APISuper();
					break;
				}
			}

			break;
			
		case "036":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct036.test036APIVCSA();
					break;
				}
			}

			break;
			
		case "037":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct037.test037APIVCRH();
					break;
				}
			}

			break;
			
		case "038":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct038.test038APIGE();
					break;
				}
			}

			break;
			
		case "040":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct040.main(null);
					break;
				}
			}

			break;


		}
	}
}
