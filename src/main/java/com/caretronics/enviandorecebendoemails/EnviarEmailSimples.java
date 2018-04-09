package com.caretronics.enviandorecebendoemails;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.hibernate.validator.constraints.Email;

public class EnviarEmailSimples {

	public void enviar(String nome, String emailDestinatario) {

		try {

			SimpleEmail simpleEmail = new SimpleEmail();

			simpleEmail.setHostName("smtp.googlemail.com"); // o servidor SMTP para envio do e-mail
			simpleEmail.addTo("springbootalura@gmail.com", "springbootemail"); // destinatário
			simpleEmail.setFrom("me@apache.org", "Me"); // remetente
			simpleEmail.setSubject("Mensagem de Teste"); // assunto do e-mail
			simpleEmail.setMsg("Teste de Email utilizando commons-email"); // conteudo do e-mail
			simpleEmail.send(); // envia o e-mail

		} catch (EmailException e) {
			String log = "";
			log.error("problemas enviando email", e);
			throw new IllegalStateException("falha ao enviar email para " + to, e);
		}

	}

}
