package com.caretronics.enviandorecebendoemails;

import java.net.URL;

import org.apache.commons.mail.HtmlEmail;

public class EnviarEmailComFormatoHTML {

	
	// Cria o e-mail
	HtmlEmail email = new HtmlEmail();
	email.setHostName("mail.myserver.com");
	email.addTo("jdoe@somewhere.org", "John Doe");
	email.setFrom("me@apache.org", "Me");
	email.setSubject("Teste de e-mail em formato HTML");
	 
	// adiciona uma imagem ao corpo da mensagem e retorna seu id
	URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
	String cid = email.embed(url, "Apache logo");
	 
	// configura a mensagem para o formato HTML
	email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");
	 
	// configure uma mensagem alternativa caso o servidor não suporte HTML
	email.setTextMsg("Seu servidor de e-mail não suporta mensagem HTML");
	 
	// envia o e-mail
	email.send();
	
}

//String gerado
//URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
//String cid = email.embed(url, "Apache logo");
//email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");
