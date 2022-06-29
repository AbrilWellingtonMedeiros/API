/****
 * Script Name	 : <b> ScriptEnviarEmail</b>
 * Generated	 : <b>18/11/2021 10:00</b>
 * Description	 : Functional Test Script
 * Original Host : Win10 version xx Build xxx (s)
 *  
 * @since  2021/11/18
 * @author Wellington Medeiros..
 * 
 * Baixar os jars
 *		
 * commons-email-1.5.jar
 *	mail-1.4.7.jar
 * 
 * 
 *	Habilitando email
 * 	No caso vocÃª deve configurar o e-mail que vocÃª estÃ¡ usando. 
 * 	Acesse o link: https://myaccount.google.com
 *
 * 	Clique no menu chamado "Segurança"
 * 	Procure a função "Acesso a app menos seguro" .
 *  Permitir aplicativos menos seguros: ATIVADA
 * 	Sendo possível o envio de e-mail!
*
 * 	Clique no menu chamado "SeguranÃ§a"
 * 	Procure a funÃ§Ã£o "Acesso a app menos seguro" e desative.
 * 
 * 	Sendo possÃ­vel o envio de e-mail! 
 * 	Espero ter ajudado, abrÃ§s!
 * 
 * Acesso a app menos seguro
*Alguns apps e dispositivos usam tecnologias de login menos seguras, o que deixa sua conta vulnerÃ¡vel. VocÃª pode desativar o acesso desses apps, o que recomendamos, ou ativÃ¡-lo se optar por usÃ¡-los apesar dos riscos. O Google desativarÃ¡ essa configuraÃ§Ã£o automaticamente se ela nÃ£o estiver sendo usada. Saiba mais

 *   Permitir aplicativos menos seguros: ATIVADA
  *  Em 30 de maio de 2022, esta configuraÃ§Ã£o nÃ£o vai mais estar disponÃ­vel. Saiba mais
 *
*
 * 
 */

package API;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.HtmlEmail;

import org.testng.annotations.Test;

import ftor_testng.AbrilUtils;
import ftor_testng.ConfigureExecution;

public class _002EnviarEmail extends AbrilUtils {

	/// Caso de Teste
	@Test
	public void EnviarEmail() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("002");
	}

	// Método de Teste
	public static void main(String[] args) {

		// DeclaraÃ§Ã£o de duas variaveis

		String meuEmail = "wellington.medeiros@abril.com.br";
		String EmailThiagoLeader = "thiago.silva@abril.com.br";
		String EmailWellington = "wellington.medeiros@abril.com.br";
		String EmailScrumMaster = "denis.russo@abril.com.br";
		String EmailFelipe = "filipe.gomes@abril.com.br";
		String minhaSenha = "@grupoabril2022@*@";

		// Objeto SimpleEmail usado para email simples sem anexo

		// SimpleEmail email = new SimpleEmail();

		// Para o exemplo do Anexo arquivos MultiPartEmail

		 MultiPartEmail email = new MultiPartEmail();
		//HtmlEmail email = new HtmlEmail();
		
		email.setDebug(true); 
		
		
		// config host, porta
		
//		email.setHostName("smtpidc.abril.com.br");
//		email.setSmtpPort(587);
		
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		

//		email.setHostName("172.20.38.19");		
//		//email.setSmtpPort(587);
//		email.setSmtpPort(587);

//		email.setHostName("172.20.38.19");		
//		email.setSmtpPort(587);


		// Autenticação do e-mail , passando email e senha
		email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));

		// Ativação do protocolo SSL
		email.setSSLOnConnect(true);
		
		// Bloco de excessao

		try {
			// De quem esse email?
			email.setFrom(meuEmail);

			// Assunto
			email.setSubject("Relat�rio de Teste");

			// Mensagem corpo email

			 email.setMsg("Relat�rio de todas as Marcas");

			
			

			// Para quem Ã© o envio do email
			//email.addTo(meuEmail);
			email.addTo(EmailThiagoLeader);
			email.addTo(EmailWellington);
			email.addTo(EmailScrumMaster);
			email.addTo(EmailFelipe);

			// codigo que vai anexar 1 arq nesse email algum arquivo

			 //EmailAttachment anexo = new EmailAttachment();
			// anexo.setPath("C:/Desenv/Projetos/Performance/GrupoAbril/Desafios/GrupoAbril/saidas/PDFReport/_005LoginOrgBlockFechadoWEB_2021111712_chrome_95.0.4638.69_Windows
			// 7.pdf");
			// anexo.setName("Arquivo LoginOrgBlockFechadoWEB.pdf");
			// email.attach(anexo);
			// email.send();

			//TLS
			email.setStartTLSEnabled(true);
			
			
			
			
			// criando vetor de anexo para varios arquivos
			 EmailAttachment[] anexos = new EmailAttachment[1];
			
			//caminho servidor
//			anexos[0] = new EmailAttachment();			
//			anexos[0].setPath("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFreport/_001TodasMarcas.pdf");
//			anexos[0].setName("Relatorio de Todas os sites.pdf");		
			
			//local
//			 anexos[0] = new EmailAttachment();
//			 anexos[0].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFreport/_001TodasMarcas.pdf");
//			 anexos[0].setName("Relatorio de Todas os sites.pdf");
			
		 
			 
			//caminho servidor
//			anexos[1] = new EmailAttachment();
//			anexos[1].setPath("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/API/_003TodasMarcas.html");
//			anexos[1].setName("Relatorio de Todas os sites.html");
			 
				//local
			 anexos[0] = new EmailAttachment();
			 anexos[0].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/API/_003TodasMarcas.html");
			 anexos[0].setName("Relatorio de Todas os sites.html");
			

			

			email.attach(anexos[0]);
//			email.attach(anexos[1]);

			
			

			// Metodo send para confirmar o envio
			email.send();
			System.out.println("Email foi enviado com sucesso!" );

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
