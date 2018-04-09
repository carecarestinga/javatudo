package com.caretronics.enviandorecebendoemails;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

public class EnviarEmailComAnexoRemoto {

	
	// cria o anexo.
	EmailAttachment anexo = new EmailAttachment();
	anexo.setURL(new URL("http://www.apache.org/images/asf_logo_wide.gif"));//endereço remoto
	anexo.setDisposition(EmailAttachment.ATTACHMENT);
	anexo.setDescription("Apache logo");
	anexo.setName("Apache logo");
	 
	// Cria a mensagem de e-mail
	MultiPartEmail email = new MultiPartEmail();
	email.setHostName("mail.myserver.com");
	email.addTo("jdoe@somewhere.org", "John Doe");
	email.setFrom("me@apache.org", "Me");
	email.setSubject("O logoTipo");
	email.setMsg("Aqui está o logoTipo da Apache");
	 
	email.attach(attachment); // adiciona o anexo
	 
	email.send();// envia o e-mail
	
	
}
