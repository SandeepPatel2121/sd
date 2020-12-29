
package com.nestlings.entities.utils;

import com.nestlings.entities.enums.NestlingsExceptionType;
import com.nestlings.entities.exceptions.NestlingsException;
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
    
}
