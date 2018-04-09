package com.caretronics.enviandorecebendoemails;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

public class EnviandoEmailComAnexo {

	
	// cria o anexo.
	EmailAttachment attachment = new EmailAttachment();
	attachment.setPath("mypictures/john.jpg"); //caminho da imagem
	attachment.setDisposition(EmailAttachment.ATTACHMENT);
	attachment.setDescription("Picture of John");
	attachment.setName("John");
	 
	// Cria a mensagem de e-mail.
	MultiPartEmail email = new MultiPartEmail();
	email.setHostName("mail.myserver.com"); // o servidor SMTP para envio do e-mail
	email.addTo("jdoe@somewhere.org", "John Doe"); //destinatario
	email.setFrom("me@apache.org", "Me"); //remetente
	email.setSubject("Mensagem de teste com anexo"); //Assunto
	email.setMsg("Aqui está a Imagem anexada ao e-mail"); //conteudo do e-mail
	email.attach(attachment); // adiciona o anexo à mensagem
	 
	email.send();// envia o e-mail
	
	
}
