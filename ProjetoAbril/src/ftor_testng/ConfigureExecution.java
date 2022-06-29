package ftor_testng;
import API._001TodasMarcas;
import API._002EnviarEmail;
import API._003TodasMarcas;

/***************************************************************************************
 * ConfigureExecution: Classe responsável por possuir os objetos, atributos e
 * métodos de configuração da execução dos casos de teste
 ***************************************************************************************/
public class ConfigureExecution {

	// Atributos
	public static String cCaso = "";
	public static int nLin = 0;
	public static int nLin2 = 0;

	// Objetos das classes de teste
	// static ReportLog reportlog = new ReportLog();
	static RelatorioPaywall reportlog = new RelatorioPaywall();

	// Objetos das classes de teste

	static _001TodasMarcas ct001 = new _001TodasMarcas();
	static _002EnviarEmail ct002 = new _002EnviarEmail();
	static _003TodasMarcas ct003 = new _003TodasMarcas();

	/*********************************************************
	 * ->Seta o ID do Caso de Teste; ->Ler o CSV; ->Chama o método
	 * processarCasosTeste,referente ao Caso de Teste;
	 *********************************************************/
	public static void configurarExecucaoCasosTeste(String idCaso) throws Exception {
		switch (idCaso) {

		case "001":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_001TodasMarcas");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		case "002":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_002EnviarEmail");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		case "003":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_003TodasMarcas");
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
	 * gravação do relatório em vídeo; ->Realiza a chamada ao método de
	 * teste.
	 ****************************************************************************************/
	public static void processarCasosTeste(String idCaso) throws Exception {
		switch (idCaso) {

		case "001":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA M�TODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct001.test001TodasMarcas();
					break;
				}
			}

			break;

		case "002":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA M�TODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct002.main(null);
					break;
				}
			}

			break;

		case "003":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA M�TODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct003.GeraHtml(null, 2);

					break;
				}
			}

			break;

		}
	}
}
