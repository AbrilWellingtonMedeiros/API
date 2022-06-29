package ftor_testng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/***********************************************************************************************
 * DataDriven -> Classe responsável pela manipulação da massa de dados (CSV).
 ***********************************************************************************************/
public class DataDriven {

	public static String cCaso = null;
	public static String nomeCaso = null;
	public static String cLinha = null;
	public static int nLin = 0;
	public static int nLin2 = 0;
	public static String nomeSistema = "Abril";
	public static String nomeSuite = "Todas as Marcas";
	public static String url = "https://preprod.veja.abril.com.br/";

	// Novas Urls API
	public static String urlapi = " https://veja.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=19-04-2022";
	public static String urlapiqr = "https://quatrorodas.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=19-04-2022";
	public static String urlapivejasp = "https://vejasp.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=14-04-2022";
	public static String urlapivejario = "https://vejario.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=14-04-2022";
	public static String urlapivejasaude = "https://saude.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=14-04-2022";
	public static String urlapisuper = "https://super.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=14-04-2022";
	public static String urlapivcsa = "https://vocesa.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=14-04-2022";
	public static String urlapivcrh = "https://vocerh.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=14-04-2022";
	public static String urlapige = "https://guiadoestudante.abril.com.br/wp-json/paywall/type_content?dataInicio=19-03-2022&dataFim=14-04-2022";
	
	
	
	
	
	
	
	public static String url1 = "https://veja.abril.com.br/cultura/estados-ensaiam-a-volta-dos-shows-no-brasil-mas-variante-delta-preocupa/";
	public static String url2 = "https://veja.abril.com.br/cultura/com-rocha-lunar-e-itens-originais-exposicao-celebra-a-ida-do-homem-a-lua/";
	public static String url3 = "https://veja.abril.com.br/politica/movimento-de-bastidores-no-stj-tenta-protelar-escolha-de-ministros/";
	public static String urlAvisoLeitura = "https://veja.abril.com.br/economia/assistir-a-copa-esta-barato-em-dolar-mas-ficou-mais-caro-para-brasileiro/";
	public static String urlFechada = "https://veja.abril.com.br/brasil/entra-em-vigor-nova-lei-sobre-o-uso-de-capacetes/";
	public static String urlEnvio = "https://outlook.live.com/owa/";
	public static String urlAMP = "https://search.google.com/test/amp";
	public static String urlpreProd = "https://preprod.abril.com.br/assinar-revista-veja-assine/";
	public static String urlProd = "https://veja.abril.com.br/";
	public static String urlProd2 = "https://veja.abril.com.br/";
	public static String urlProdlogin = "https://veja.abril.com.br/";
	public static String urlProdQR = "https://quatrorodas.abril.com.br/";
	public static String urlAssineAbrilDebito = "https://abril.com.br/teste-assine-abril-2/";
	public static String urlAssineAbrilBoleto = "https://abril.com.br/teste-assine-abril/";
	public static String urlVejaSAudeDigital = "https://abril.com.br/assine-abril/veja-saude/oferta/SAUDE_DIGITAL/";
	public static String urlVejaSAudeDigitalNovoCheckout = "https://abril.com.br/assine-abril/veja-saude/oferta/SAUDE_DIGITAL/?site-assine&url-retorno=&tipo_paywall=";

	// GUTEM

	public static String urlGutem = "https://gutenberg.veja.abril.com.br";
	public static String urlLoginAmpGutem = "https://gutenberg.veja.abril.com.br/coluna/radar/cni-lidera-missao-com-300-empresarios-brasileiros-aos-emirados-arabes/amp/";
	public static String urlGutemvejario = "https://gutenberg.vejario.abril.com.br";

	// Urls testes de contabilizados

	public static String urlveja1 = "https://veja.abril.com.br/mundo/china-sabia-das-intencoes-da-russia-na-ucrania-e-pediu-para-adiar-invasao/";// 1
	// conteudo
	public static String urlveja2 = "https://veja.abril.com.br/economia/banco-central-divulga-passo-a-passo-para-sacar-dinheiro-esquecido/";// ultimo
																																			// conteudo
	public static String urlveja3 = "https://veja.abril.com.br/mundo/vamos-mandar-a-russia-embora-com-a-vergonha-que-merece-diz-zelensky/";// paywall
	public static String urlveja4 = "https://veja.abril.com.br/tecnologia/apple-toma-posicao-firme-contra-russia/";
	public static String urlveja5 = "https://veja.abril.com.br/mundo/38-paises-denunciam-atrocidades-da-russia-em-corte-internacional/";

	// veja SP
	public static String urlVejaSP1 = "https://vejasp.abril.com.br/cidades/policial-conhecido-como-hipster-da-federal-e-morto-ao-invadir-casa/";
	public static String urlVejaSP2 = "https://vejasp.abril.com.br/cidades/homem-morto-invadir-carro-conjunto-habitaciona-prefeitura-vila-leopoldina-atropelamento/";
	public static String urlVejaSP3 = "https://vejasp.abril.com.br/saude/atriz-ana-beatriz-nogueira-diagnosticada-cancer-pulmao/";
	public static String urlVejaSP4 = "https://vejasp.abril.com.br/cidades/video-agua-invade-area-check-in-aeroporto-guarulhos/";
	public static String urlVejaSP5 = "https://vejasp.abril.com.br/saude/sao-paulo-reinicia-vacinacao-de-criancas-contra-covid-19/";

	// veja rio
	public static String urlVejaRio1 = "https://vejario.abril.com.br/cidade/carnaval-12-blocos-clandestinos/";
	public static String urlVejaRio2 = "https://vejario.abril.com.br/cidade/cronograma-ensaios-tecnicos-carnaval-sambodromo/";
	public static String urlVejaRio3 = "https://vejario.abril.com.br/cidade/vacinacao-covid-mascara-passaporte-vacinal/";
	public static String urlVejaRio4 = "https://vejario.abril.com.br/cidade/rio-capital-mais-quente/";
	public static String urlVejaRio5 = "https://vejario.abril.com.br/cidade/bicentenario-independencia-quinta-boa-vista/";

	// veja Saude
	public static String urlVejaSaude1 = "https://saude.abril.com.br/medicina/leucemia-o-que-e/";
	public static String urlVejaSaude2 = "https://saude.abril.com.br/medicina/startup-foca-no-controle-de-doencas-cronicas/";
	public static String urlVejaSaude3 = "https://saude.abril.com.br/medicina/zoom-la-do-fundo-para-o-mundo/";
	public static String urlVejaSaude4 = "https://saude.abril.com.br/medicina/terapia-revolucionaria-contra-o-cancer-e-aprovada-no-brasil/";
	public static String urlVejaSaude5 = "https://saude.abril.com.br/medicina/violencia-obstetrica-o-que-e/";

	// QR
	public static String urlQR1 = "https://quatrorodas.abril.com.br/auto-servico/quanto-custa-manter-uma-fiat-strada-freedom-cs-1-3-de-r-96-990/";
	public static String urlQR2 = "https://quatrorodas.abril.com.br/noticias/colecao-dos-sonhos-brasileiro-tem-bmw-m3-de-todas-as-geracoes/";
	public static String urlQR3 = "https://quatrorodas.abril.com.br/noticias/polestar-o2-e-conversivel-com-drone-autonomo-que-filma-e-segue-o-carro/";
	public static String urlQR4 = "https://quatrorodas.abril.com.br/noticias/governo-reduz-ipi-de-carros-novos-em-185-mas-efeito-nao-vai-durar/";
	public static String urlQR5 = "https://quatrorodas.abril.com.br/noticias/chevrolet-onix-plus-sai-de-linha-no-mexico-para-ser-importado-da-china/";

	// VC_SA
	public static String urlVC_SA1 = "https://vocesa.abril.com.br/mercado-financeiro/uma-piada-de-guerra/";
	public static String urlVC_SA2 = "https://vocesa.abril.com.br/mercado-financeiro/ibovespa-escapa-do-estresse-geopolitico-e-sobe-em-dia-dificil/";
	public static String urlVC_SA3 = "https://vocesa.abril.com.br/mercado-financeiro/mercado-comeca-semana-enfrentando-ameaca-de-guerra-e-fed-agressivo/";
	public static String urlVC_SA4 = "https://vocesa.abril.com.br/mercado-financeiro/casa-branca-diz-que-putin-vai-invadir-a-ucrania-na-semana-que-vem-petroleo-sobe-33/";
	public static String urlVC_SA5 = "https://vocesa.abril.com.br/sociedade/steve-jobs-o-cara-de-us-300-bilhoes/";

	// VC_RH
	public static String urlVC_RH1 = "https://vocerh.abril.com.br/futurodotrabalho/playkids-cria-guia-do-trabalho-remoto/";
	public static String urlVC_RH2 = "https://vocerh.abril.com.br/voce-rh/ceos-e-rh-tem-visoes-diferentes-sobre-o-periodo-de-pandemia/";
	public static String urlVC_RH3 = "https://vocerh.abril.com.br/livros/a-arte-de-mudar-de-ideia/";
	public static String urlVC_RH4 = "https://vocerh.abril.com.br/voce-rh/covid-19-funcionario-pode-ser-demitido-se-recusar-vacina/";
	//public static String urlVC_RH5 = "https://vocerh.abril.com.br/futurodotrabalho/streaming-chega-aos-treinamentos-corporativos/"; aberta

	// GE
	public static String urlGE1 = "https://guiadoestudante.abril.com.br/curso-enem-play/plano-de-estudos-de-biologia-1-mes/";
	public static String urlGE2 = "https://guiadoestudante.abril.com.br/curso-enem-play/plano-de-estudos-de-filosofia-1-mes/";
	public static String urlGE3 = "https://guiadoestudante.abril.com.br/curso-enem-play/plano-de-estudos-de-redacao-1-mes/";
	public static String urlGE4 = "https://guiadoestudante.abril.com.br/curso-enem-play/plano-de-estudos-de-fisica-1-mes/";
	public static String urlGE5 = "https://guiadoestudante.abril.com.br/curso-enem-play/plano-de-estudos-de-historia-1-mes/";

	// Super
	public static String urlSuper1 = "https://super.abril.com.br/ciencia/caes-sofrem-com-luto-quando-outro-cachorro-morre/";
	public static String urlSuper2 = "https://super.abril.com.br/historia/as-estacoes-de-metro-de-kiev-foram-feitas-para-aguentar-ataques-militares/";
	public static String urlSuper3 = "https://super.abril.com.br/tecnologia/antonov-225-destruido-na-ucrania-nasceu-para-carregar-onibus-espacial-sovietico/";
	public static String urlSuper4 = "https://super.abril.com.br/sociedade/quem-e-volodymyr-zelensky-o-comediante-que-virou-presidente-da-ucrania/";
	public static String urlSuper5 = "https://super.abril.com.br/ciencia/asteroide-extinguiu-os-dinossauros-na-primavera-do-hemisferio-norte/";

	// Variaveis
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

	public static String pagamentocartaocreditonome = null;
	public static String CardNumber1 = null;
	public static String ExpiryDate = null;
	public static String SecurityCode = null;
	public static String pagamentocartaocreditocpfcnpj = null;
	public static String pagamentocartaocreditocpfcnpjsaude = null;

	// boleto
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

	// boletos
	public static ArrayList<String> apagamentodebitocontacpfcnpj = new ArrayList<String>();
	public static ArrayList<String> apagamentodebitocontaagencia = new ArrayList<String>();
	public static ArrayList<String> apagamentodebitocontaagenciadigito = new ArrayList<String>();
	public static ArrayList<String> apagamentodebitocontaconta = new ArrayList<String>();
	public static ArrayList<String> apagamentodebitocontacontadigito = new ArrayList<String>();

	public static void lerCSV() throws Exception {

		// Leitura do CSV
		File arquivoCSV = new File("dados/MASSA_API.csv");
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

			System.out.println("Não foi possível ler a planilha .csv");
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
