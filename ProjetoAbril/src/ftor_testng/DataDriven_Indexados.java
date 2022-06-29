package ftor_testng;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/***********************************************************************************************
 * DataDriven -> Classe respons�vel pela manipula��o da massa de dados (CSV).
 ***********************************************************************************************/
public class DataDriven_Indexados {

	public static String cCaso = null;
	public static String nomeCaso = null;
	public static String cLinha = null;
	public static int nLin = 0;
	public static int nLin2 = 0;
	public static String nomeSistema = "Indexados";
	public static String nomeSuite = "Indexados Google";
	public static String url = "site:https://veja.abril.com.br/amp-story/o-cardapio-da-dieta-cetogenica/";
	public static String UrlStory = "https://veja.abril.com.br/amp-story/";
	
	//Novas Urls	
	
	
	
	public static String idCaso = null;
	public static String areacod = null;
	public static String usuario = null;
	public static String senha = null;
	public static String usuariogutem = null;
	public static String senhagutem = null;		
	public static String senhagmail = null;
	public static String emailgmail = null;
	
	public static String emaildestino1 = null;
	public static String emaildestino2 = null;
	public static String assuntoemail = null;
	public static String mensagem = null;
	
	public static String identificacaonomecompleto = null;
	public static String identificacaoemail = null;
	public static String identificacaotelefone = null;
	
	public static String enderecocep = null;
	public static String enderecologradouro = null;
	public static String endereconumero = null;
	public static String enderecocomplemento = null;
	public static String enderecobairro = null;
	public static String enderecouf = null;
	public static String enderecocidade = null;	
	
	public static String pagamentocartaocreditonome	= null;
	public static String CardNumber1 = null;
	public static String ExpiryDate = null;
	public static String SecurityCode = null;
	public static String pagamentocartaocreditocpfcnpj = null;
	public static String pagamentocartaocreditocpfcnpjsaude = null;
	
	//boleto
	public static String pagamentodebitocontacpfcnpj = null;
	public static String pagamentodebitocontaagencia = null;
	public static String pagamentodebitocontaagenciadigito = null;
	public static String pagamentodebitocontaconta = null;
	public static String pagamentodebitocontacontadigito = null;
	

	public static ArrayList<String> aLinha = new ArrayList<String>();
	public static ArrayList<String> aidCaso = new ArrayList<String>();
	public static ArrayList<String> aUrl = new ArrayList<String>();
	public static ArrayList<String> aareacod = new ArrayList<String>();	
	public static ArrayList<String> ausuario = new ArrayList<String>();	
	public static ArrayList<String> asenha = new ArrayList<String>();
	public static ArrayList<String> ausuariogutem = new ArrayList<String>();	
	public static ArrayList<String> asenhagutem = new ArrayList<String>();
	
	public static ArrayList<String> asenhagmail = new ArrayList<String>();
	public static ArrayList<String> aemailgmail = new ArrayList<String>();
	
	public static ArrayList<String> aemaildestino1 = new ArrayList<String>();
	public static ArrayList<String> aemaildestino2 = new ArrayList<String>();
	public static ArrayList<String> aassuntoemail = new ArrayList<String>();
	public static ArrayList<String> amensagem = new ArrayList<String>();
	
	
	public static ArrayList<String> aidentificacaonomecompleto = new ArrayList<String>();
	public static ArrayList<String> aidentificacaoemail = new ArrayList<String>();
	public static ArrayList<String> aidentificacaotelefone = new ArrayList<String>();
	
	public static ArrayList<String> aenderecocep = new ArrayList<String>();
	public static ArrayList<String> aenderecologradouro = new ArrayList<String>();
	public static ArrayList<String> aendereconumero = new ArrayList<String>();
	public static ArrayList<String> aenderecocomplemento = new ArrayList<String>();
	public static ArrayList<String> aenderecobairro = new ArrayList<String>();
	public static ArrayList<String> aenderecouf = new ArrayList<String>();
	public static ArrayList<String> aenderecocidade = new ArrayList<String>();	
	
	public static ArrayList<String> apagamentocartaocreditonome = new ArrayList<String>();
	public static ArrayList<String> aCardNumber1 = new ArrayList<String>();
	public static ArrayList<String> aExpiryDate = new ArrayList<String>();
	public static ArrayList<String> aSecurityCode = new ArrayList<String>();
	public static ArrayList<String> apagamentocartaocreditocpfcnpj = new ArrayList<String>();
	public static ArrayList<String> apagamentocartaocreditocpfcnpjsaude = new ArrayList<String>();
	
	//boletos
	public static ArrayList<String> apagamentodebitocontacpfcnpj = new ArrayList<String>();
	public static ArrayList<String> apagamentodebitocontaagencia = new ArrayList<String>();
	public static ArrayList<String> apagamentodebitocontaagenciadigito = new ArrayList<String>();
	public static ArrayList<String> apagamentodebitocontaconta = new ArrayList<String>();
	public static ArrayList<String> apagamentodebitocontacontadigito = new ArrayList<String>();
	

	
	public static void lerCSV() throws Exception {

		// Leitura do CSV
		File arquivoCSV = new File("dados/MASSA_ABRIL_INDEXADOS.csv");
		FileInputStream arquivoStream = new FileInputStream(arquivoCSV);
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(arquivoStream, "ISO-8859-1"));
			while (in.ready()) {
				cLinha = in.readLine();

				if (cLinha != null) {
					String[] campos = cLinha.split(";");

					aLinha.add(cLinha);
					aareacod.add(campos[0]);
					asenhagmail.add(campos[1]);
					asenha.add(campos[2]);
					ausuario.add(campos[3]);
					asenhagutem.add(campos[4]);
					ausuariogutem.add(campos[5]);
					aemailgmail.add(campos[6]);
					aemaildestino1.add(campos[7]);
					aemaildestino2.add(campos[8]);
					aassuntoemail.add(campos[9]);
					amensagem.add(campos[10]);
					
					aidentificacaonomecompleto.add(campos[11]);
					aidentificacaoemail.add(campos[12]);
					aidentificacaotelefone.add(campos[13]);
					
					
					apagamentocartaocreditonome.add(campos[14]);
					aCardNumber1.add(campos[15]);
					aExpiryDate.add(campos[16]);
					aSecurityCode.add(campos[17]);
					apagamentocartaocreditocpfcnpj.add(campos[18]);
					apagamentocartaocreditocpfcnpjsaude.add(campos[19]);
					
					aenderecocep.add(campos[20]);
					aenderecologradouro.add(campos[21]);
					aendereconumero.add(campos[22]);
					aenderecocomplemento.add(campos[23]);
					aenderecobairro.add(campos[24]);
					aenderecouf.add(campos[25]);
					aenderecocidade.add(campos[26]);
					
					apagamentodebitocontacpfcnpj.add(campos[27]);
					apagamentodebitocontaagencia.add(campos[28]);
					apagamentodebitocontaagenciadigito.add(campos[29]);
					apagamentodebitocontaconta.add(campos[30]);
					apagamentodebitocontacontadigito.add(campos[31]);
					
					aidCaso.add(campos[32]);

				}
			}

			in.close();
		}

		catch (final Exception e) {

			System.out.println("N�o foi poss�vel ler a planilha .csv");
			throw new Exception();
		}
	}

	public static void lerRegistro() {
		// LER REGISTRO (get do array)
		idCaso = aidCaso.get(nLin);
		areacod = aareacod.get(nLin);
		senhagmail = asenhagmail.get(nLin);
		senha = asenha.get(nLin);
		usuario = ausuario.get(nLin);
		senhagutem = asenhagutem.get(nLin);
		usuariogutem = ausuariogutem.get(nLin);
		emailgmail = aemailgmail.get(nLin);
		emaildestino1 = aemaildestino1.get(nLin);
		emaildestino2 = aemaildestino2.get(nLin);
		assuntoemail = aassuntoemail.get(nLin);
		mensagem = amensagem.get(nLin);
		
		identificacaonomecompleto = aidentificacaonomecompleto.get(nLin);
		identificacaoemail = aidentificacaoemail.get(nLin);
		identificacaotelefone = aidentificacaotelefone.get(nLin);
		
		enderecocep = aenderecocep.get(nLin);
		enderecologradouro = aenderecologradouro.get(nLin);
		endereconumero = aendereconumero.get(nLin);
		enderecocomplemento = aenderecocomplemento.get(nLin);
		enderecobairro = aenderecobairro.get(nLin);
		enderecouf = aenderecouf.get(nLin);
		enderecocidade = aenderecocidade.get(nLin);
		
		pagamentocartaocreditonome = apagamentocartaocreditonome.get(nLin);
		CardNumber1 = aCardNumber1.get(nLin);
		ExpiryDate = aExpiryDate.get(nLin);
		SecurityCode = aSecurityCode.get(nLin);
		pagamentocartaocreditocpfcnpj = apagamentocartaocreditocpfcnpj.get(nLin);
		pagamentocartaocreditocpfcnpjsaude = apagamentocartaocreditocpfcnpjsaude.get(nLin);
		
		
		pagamentodebitocontacpfcnpj = apagamentodebitocontacpfcnpj.get(nLin);
		pagamentodebitocontaagencia = apagamentodebitocontaagencia.get(nLin);
		pagamentodebitocontaagenciadigito = apagamentodebitocontaagenciadigito.get(nLin);
		pagamentodebitocontaconta = apagamentodebitocontaconta.get(nLin);
		pagamentodebitocontacontadigito = apagamentodebitocontacontadigito.get(nLin);

	}
}

