
package com.nestlings.email.config;

import com.nestlings.entities.email.EmailDetail;
import org.springframework.beans.factory.annotation.Value;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author ú
 */
@Slf4j
public class SendEmailConfig {
    
    
    @Value("${from.email.address}")
    private String fromAddress;

    @Value("${smtp.username}")
    private String smtpUsername;

    @Value("${smtp.password}")
    private String smtpPassword;

    @Value("${smtp.host}")
    private String smtpHost;

    @Value("${smtp.port}")
    private int smtpPort;
    
    @Value("${nestlings.server.url}")
    private String nestlingsServerUrl;
    
    public void send(EmailDetail emailDetail) throws  MessagingException {
           
        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port",smtpPort);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true");
            Session session = Session.getDefaultInstance(props);
            MimeMessage msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(fromAddress, "Nestlings"));
        } catch (UnsupportedEncodingException e) {
            log.error("UnsupportedEncodingException",e.getMessage());
        }
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(emailDetail.getTo()));
        msg.setSubject(emailDetail.getSubject());
        msg.setContent(emailDetail.getMessage(), "text/html");
            Transport transport = session.getTransport();
        try {
            transport.connect(smtpHost,smtpUsername,smtpPassword);
            transport.sendMessage(msg, msg.getAllRecipients());
            log.debug("Email sent!");
          
        } catch (Exception ex) {
            ex.printStackTrace();
            log.info("The email was not sent." + emailDetail.getTo());
            log.debug("The email was not sent.");
            log.debug("Error message: " + ex.getMessage());
        } finally {
            transport.close();
        }

    }
     
//      private boolean send(EmailDetail emailDetail) throws  MessagingException {
//         
//        Properties props = System.getProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.port",587);
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
////        props.put("mail.smtp.starttls.required", "true");
//            Session session = Session.getDefaultInstance(props);
//            MimeMessage msg = new MimeMessage(session);
//        try {
//            msg.setFrom(new InternetAddress("byptqa1@gmail.com", "Nestlings"));
//        } catch (UnsupportedEncodingException e) {
//            logger.error("UnsupportedEncodingException",e.getMessage());
//        }
//        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(emailDetail.getTo()));
//        msg.setSubject(emailDetail.getSubject());
//        msg.setContent(emailDetail.getMessage(), "text/html");
//            Transport transport = session.getTransport();
//        try {
//            transport.connect("smtp.gmail.com","byptqa1@gmail.com","bypt@2020");
//            transport.sendMessage(msg, msg.getAllRecipients());
//            logger.debug("Email sent!");
//            return true;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            logger.info("The email was not sent." + emailDetail.getTo());
//            logger.debug("The email was not sent.");
//            logger.debug("Error message: " + ex.getMessage());
//        } finally {
//            transport.close();
//        }
//
//        return false;
//
//    }
    
}
