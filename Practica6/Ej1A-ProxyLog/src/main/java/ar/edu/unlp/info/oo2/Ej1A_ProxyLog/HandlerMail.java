package ar.edu.unlp.info.oo2.Ej1A_ProxyLog;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Properties;
import java.util.logging.*;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class HandlerMail extends Handler{

	@Override
	public void publish(LogRecord record) {
		try {
			String from = "example@logger.com";
			String to = "destination@mail.com";

			// credenciales
			String username = "f5b976d7986117"; // Completar con su username de mailtrap
			String password = "244102ffe8de61"; // Completar con su password de mailtrap
			
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");				 
			Session session = Session.getInstance(props,
				new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		            	return new PasswordAuthentication(username, password);
		            }
			});

		    Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(from, "Java logging mail"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    String hoy = LocalDate.now().getDayOfMonth()+"/"+LocalDate.now().getMonth()+"/"+LocalDate.now().getYear();
		    String hora = LocalTime.now().toString(); 
		    message.setSubject("Log de "+hoy+" "+hora);
		    message.setText(record.getLevel()+": "+record.getMessage());
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
