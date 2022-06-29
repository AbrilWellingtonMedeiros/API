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
 * 	No caso você deve configurar o e-mail que você está usando. 
 * 	Acesse o link: https://myaccount.google.com
 *
 * 	Clique no menu chamado "Seguran�a"
 * 	Procure a fun��o "Acesso a app menos seguro" .
 *  Permitir aplicativos menos seguros: ATIVADA
 * 	Sendo poss�vel o envio de e-mail!
*
 * 	Clique no menu chamado "Segurança"
 * 	Procure a função "Acesso a app menos seguro" e desative.
 * 
 * 	Sendo possível o envio de e-mail! 
 * 	Espero ter ajudado, abrçs!
 * 
 * Acesso a app menos seguro
*Alguns apps e dispositivos usam tecnologias de login menos seguras, o que deixa sua conta vulnerável. Você pode desativar o acesso desses apps, o que recomendamos, ou ativá-lo se optar por usá-los apesar dos riscos. O Google desativará essa configuração automaticamente se ela não estiver sendo usada. Saiba mais

 *   Permitir aplicativos menos seguros: ATIVADA
  *  Em 30 de maio de 2022, esta configuração não vai mais estar disponível. Saiba mais
 *
*
 * 
 */

package cenarios;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ftor_testng.AbrilUtils;
import ftor_testng.ConfigureExecution;
import ftor_testng.ReportLog;

public class _012EnviarEmailbkp extends AbrilUtils {

	/// Caso de Teste
	@Test
	public void EnviarEmail() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("012");
	}

	// M�todo de Teste
	public static void main(String[] args) {

		// Declaração de duas variaveis

		String meuEmail = "wellington.medeiros@abril.com.br";
		//String EmailThiagoLeader = "thiago.silva@abril.com.br";
		String EmailWellington = "wellington.medeiros@abril.com.br";
		//String EmailScrumMaster = "denis.russo@abril.com.br";
		String minhaSenha = "@grupoabril2022@*";

		// Objeto SimpleEmail usado para email simples sem anexo

		// SimpleEmail email = new SimpleEmail();

		// Para o exemplo do Anexo arquivos MultiPartEmail

		MultiPartEmail email = new MultiPartEmail();
		
		email.setDebug(true); 
		// config host, porta
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		

//		email.setHostName("172.20.38.19");		
//		//email.setSmtpPort(587);
//		email.setSmtpPort(587);

		//email.setHostName("172.20.38.19");		
		//email.setSmtpPort(587);


		// Autentica��o do e-mail , passando email e senha
		email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));

		// Ativa��o do protocolo SSL
		email.setSSLOnConnect(true);
		
		// Bloco de excessao

		try {
			// De quem esse email?
			email.setFrom(meuEmail);

			// Assunto
			email.setSubject("Relat�rios de Testes");

			// Mensagem corpo email

			// email.setMsg("Testando envio de email relatorios pdf , anexos
			// abaixo...");

			email.setMsg("O log dos relat�rios seguem anexo! ");

			// Para quem é o envio do email
			//email.addTo(meuEmail);
			//email.addTo(EmailThiagoLeader);
			email.addTo(EmailWellington);
			//email.addTo(EmailScrum);

			// codigo que vai anexar 1 arq nesse email algum arquivo

			// EmailAttachment anexo = new EmailAttachment();
			// anexo.setPath("C:/Desenv/Projetos/Performance/GrupoAbril/Desafios/GrupoAbril/saidas/PDFReport/_005LoginOrgBlockFechadoWEB_2021111712_chrome_95.0.4638.69_Windows
			// 7.pdf");
			// anexo.setName("Arquivo LoginOrgBlockFechadoWEB.pdf");
			// email.attach(anexo);
			// email.send();

			// criando vetor de anexo para varios arquivos
			EmailAttachment[] anexos = new EmailAttachment[1];
//			anexos[0] = new EmailAttachment();
//			anexos[0].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/newMerged.pdf");
//			anexos[0].setName("APIS.pdf");	
			
			//caminho servidor
			anexos[0] = new EmailAttachment();
			
			anexos[0].setPath("C:/Users/A515360/.jenkins/workspace/API/ProjetoAbril/saidas/PDFReport/newMerged.pdf");
			anexos[0].setName("APIS.pdf");
			
//			anexos[0].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_030APIVeja.pdf");
//			anexos[0].setName("APIS.pdf");
			
			
			//anexos[0] = new EmailAttachment();
//			anexos[0].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_030APIVeja.pdf");
//			anexos[0].setName("APIVEJA.pdf");			
			//caminho servidor
			//anexos[0] = new EmailAttachment();
//			anexos[0].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_030APIVeja.pdf");
//			anexos[0].setName("APIVEJA.pdf");
			
			//anexos[1] = new EmailAttachment();
			//anexos[1].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas//PDFReport/_031APIQR.pdf");
			//anexos[1].setName("APIQR.pdf");
			//caminho servidor
			//anexos[1].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_031APIQR.pdf");
			//anexos[1].setName("APIQR.pdf");
			
			
			//anexos[2] = new EmailAttachment();
			//anexos[2].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_032APIVejaSP.pdf");
			//anexos[2].setName("APIVejaSP.pdf");
			
			//anexos[3] = new EmailAttachment();			
			//anexos[3].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_033APIVejaRio.pdf");
			//anexos[3].setName("APIVejaRio.pdf");
			
			//anexos[4] = new EmailAttachment();
			//anexos[4].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_034APIVejaSaude.pdf");
			//anexos[4].setName("APIVejaSaude.pdf");
			
			//anexos[5] = new EmailAttachment();			
			//anexos[5].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_035APISuper.pdf");
			//anexos[5].setName("APISuper.pdf");
			
			//anexos[6] = new EmailAttachment();
			//anexos[6].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_036APIVCSA.pdf");
			//anexos[6].setName("APIVCSA.pdf");
			
			
			//anexos[7] = new EmailAttachment();
			//anexos[7].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_037APIVCRH.pdf");
			//anexos[7].setName("APIVCRH.pdf");
			
			//anexos[8] = new EmailAttachment();
			//anexos[8].setPath("C:/Users/a515360/git/automated-tests-api/ProjetoAbril/saidas/PDFReport/_038APIGE.pdf");
			//anexos[8].setName("APIGE.pdf");
			

			email.attach(anexos[0]);
//			email.attach(anexos[1]);
//			email.attach(anexos[2]);
//			email.attach(anexos[3]);
//			email.attach(anexos[4]);
//			email.attach(anexos[5]);
//			email.attach(anexos[6]);
//			email.attach(anexos[7]);
//			email.attach(anexos[8]);
			
			

			// Metodo send para confirmar o envio
			email.send();
			System.out.println("Email foi enviado com sucesso!" );

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
