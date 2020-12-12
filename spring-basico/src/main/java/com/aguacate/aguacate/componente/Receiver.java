package com.aguacate.aguacate.componente;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import com.aguacate.aguacate.model.Email;


@Component
public class Receiver {

	@JmsListener(destination = "mailbox", containerFactory = "myFactory")
	public void receiveMessage(Email email) {
		System.out.println("Email recibido <" + email + ">");
	}

}