package Controlador;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarCorreo {

    private final String username = "sistema.prep6@gmail.com";
    private final String password = "A10B8C1+10R";
    private String estadoDelMensaje;
    
    public String Enviar(String to, String encabezado, String mensaje){
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("sistema.prep6@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(to)
            );
            message.setSubject(encabezado);
            message.setText(mensaje);

            Transport.send(message);

            estadoDelMensaje = "Enviado";

        } catch (MessagingException e) {
            e.printStackTrace();
            estadoDelMensaje = "Mensaje fallido";
        }
        return estadoDelMensaje;
    }

}
