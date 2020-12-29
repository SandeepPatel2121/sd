
package com.nestlings.entities.utils;

import com.nestlings.entities.emailsubscription.EmailSubscriptionDetails;
import com.nestlings.entities.enums.NestlingsExceptionType;
import com.nestlings.entities.exceptions.NestlingsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ú
 */
@Component
public class EmailSubscriptionRepo {
    
    private final Logger LOGGER = LoggerFactory.getLogger(EmailSubscriptionRepo.class);

    @Autowired
    private NestlingsCryptoUtil nestlingsCryptoUtil;

    private Map<String, EmailSubscriptionDetails> emailSubscriptionDetailsMap;

    public EmailSubscriptionRepo() {
        this.emailSubscriptionDetailsMap = new HashMap();
    }

    public void setEmailSubscriptionDetails(List<EmailSubscriptionDetails> emailSubscriptions) {
        if (emailSubscriptions != null && !emailSubscriptions.isEmpty()) {
            emailSubscriptions.stream().forEach((emailSubscription) -> {
                setEmailSubscriptionDetails(emailSubscription);
            });
        }
    }

    public void setEmailSubscriptionDetails(EmailSubscriptionDetails emailSubscriptionDetails) {
        if (emailSubscriptionDetails.getUnSubscribeToken() == null || emailSubscriptionDetails.getUnSubscribeToken().isEmpty()) {
            emailSubscriptionDetails.setUnSubscribeToken(nestlingsCryptoUtil.encrypt(emailSubscriptionDetails.getEmailId()));
        }
        this.emailSubscriptionDetailsMap.put(emailSubscriptionDetails.getEmailId(), emailSubscriptionDetails);
    }

    public boolean hasEmailSubscriptionDetailsByUserEmail(String emailId) {
        return this.emailSubscriptionDetailsMap.containsKey(emailId);
    }

    public boolean isSubscribedToSendEmailByUnsubscribeToken(String unsubscribeToken) {
        return this.isSubscribedToSendEmail(this.getDecryptedEmail(unsubscribeToken));
    }

    public boolean isSubscribedToSendEmail(String emailId) {
        boolean subscribed = true;
        try {
            if (this.hasEmailSubscriptionDetailsByUserEmail(emailId) && this.getEmailSubscriptionDetailsByUserEmail(emailId) != null
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

    public EmailSubscriptionDetails getEmailSubscriptionDetailsByUnsubscribeToken(String unsubscribeToken) {
        EmailSubscriptionDetails emailSubscriptionDetails = null;
        try {
            String email = this.getDecryptedEmail(unsubscribeToken);
            emailSubscriptionDetails
                    = this.getEmailSubscriptionDetailsByUserEmail(email);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            //throw new NestlingsException(NestlingsExceptionType.RUNTIME_EXCEPTION, e.getMessage());
        }
        return emailSubscriptionDetails;

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

    public String getEncryptedEmail(String emailId) {
        String decryptedEmail = null;
        try {
            decryptedEmail = nestlingsCryptoUtil.encrypt(emailId);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            //throw new NestlingsException(NestlingsExceptionType.RUNTIME_EXCEPTION, e.getMessage());
        }
        return decryptedEmail;
    }

    public Map<String, EmailSubscriptionDetails> getEmailSubscriptionDetailsMap() {
        return emailSubscriptionDetailsMap;
    }

    public void setEmailSubscriptionDetailsMap(Map<String, EmailSubscriptionDetails> emailSubscriptionDetailsMap) {
        this.emailSubscriptionDetailsMap = emailSubscriptionDetailsMap;
    }
}
