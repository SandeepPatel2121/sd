
package com.nestlings.entities.utils;

import com.nestlings.entities.emailsubscription.EmailSubscriptionDetails;
import com.nestlings.entities.enums.NestlingsExceptionType;
import com.nestlings.entities.exceptions.NestlingsException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ú
 */
@Component
public class EmailSubscriptionRepo {
    
        private final Logger LOGGER = LoggerFactory.getLogger(EmailSubscriptionRepo.class);
    
    private Map<String, EmailSubscriptionDetails> emailSubscriptionDetailsMap;

    public EmailSubscriptionRepo() {
        this.emailSubscriptionDetailsMap = new HashMap();
    }
        
    @Autowired
    private NestlingsCryptoUtil nestlingsCryptoUtil;
    
      public String getEncryptedEmail(String emailId) {
        String decryptedEmail = null;
        try {
            decryptedEmail = nestlingsCryptoUtil.encrypt(emailId);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw new NestlingsException(NestlingsExceptionType.RUNTIME_EXCEPTION, e.getMessage());
        }
        return decryptedEmail;
    }
    
    public boolean isSubscribedToSendEmailByUnsubscribeToken(String unsubscribeToken) {
        return isSubscribedToSendEmail(this.getDecryptedEmail(unsubscribeToken));
    }

    public boolean isSubscribedToSendEmail(String emailId) {
        boolean subscribed = true;
        try {
            if (hasEmailSubscriptionDetailsByUserEmail(emailId) && getEmailSubscriptionDetailsByUserEmail(emailId) != null
                    && this.getEmailSubscriptionDetailsByUserEmail(emailId).getStatusId() == 2) {
                subscribed = false;
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return subscribed;
    }
    
    public EmailSubscriptionDetails getEmailSubscriptionDetailsByUserEmail(String emailId) {
        return this.emailSubscriptionDetailsMap.get(emailId);
    }
    
    public String getDecryptedEmail(String encryptedEmail) {
        String decryptedEmail = null;
        try {
            decryptedEmail = nestlingsCryptoUtil.decrypt(encryptedEmail);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            //throw new NestlingsException(NestlingsExceptionType.RUNTIME_EXCEPTION, e.getMessage());
        }
        return decryptedEmail;
    }
    
    public boolean hasEmailSubscriptionDetailsByUserEmail(String emailId) {
        return this.emailSubscriptionDetailsMap.containsKey(emailId);
    }
    
}
