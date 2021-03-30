
package com.nestlings.email.config;

import com.nestlings.agent.model.AgentDetailsModel;
import com.nestlings.entities.email.EmailDetail;
import com.nestlings.member.MemberDetails;
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
        props.put("mail.smtp.port",smtpHost);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true");
            Session session = Session.getDefaultInstance(props);
            MimeMessage msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress("yes.kabutar@gmail.com", "Nestlings"));
        } catch (UnsupportedEncodingException e) {
            log.error("UnsupportedEncodingException {}",e.getMessage());
        }
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(emailDetail.getTo()));
        msg.setSubject(emailDetail.getSubject());
        msg.setContent(emailDetail.getMessage(), "text/html");
            Transport transport = session.getTransport();
        try {
            transport.connect("Smtp.gmail.com","byptqa1@gmail.com","Bypt@2021");
            transport.sendMessage(msg, msg.getAllRecipients());
            log.debug("Email sent!");
          
        } catch (Exception ex) {
            log.info("The email was not sent." + emailDetail.getTo());
            log.debug("The email was not sent.");
            log.debug("Error message: " + ex.getMessage());
        } finally {
            transport.close();
        }

    }

}
