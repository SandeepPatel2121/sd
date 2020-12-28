package com.nestlings.entities.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.security.spec.KeySpec;
import java.util.Base64;

@Component
public class NestlingsCryptoUtil {

    private final Logger LOGGER = LoggerFactory.getLogger(NestlingsCryptoUtil.class);

    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    private KeySpec keySpec;
    private SecretKeyFactory secretKeyFactory;
    private Cipher cipher;
    byte[] arrayBytes;
    private String arEncryptionKey;
    private String arEncryptionScheme;
    SecretKey key;

    public NestlingsCryptoUtil() throws Exception {
        arEncryptionKey = "1yektercesotpyrcsgniltsen";
        arEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
        arrayBytes = arEncryptionKey.getBytes(UNICODE_FORMAT);
        keySpec = new DESedeKeySpec(arrayBytes);
        secretKeyFactory = SecretKeyFactory.getInstance(arEncryptionScheme);
        cipher = Cipher.getInstance(arEncryptionScheme);
        key = secretKeyFactory.generateSecret(keySpec);
    }

    public String encrypt(String unencryptedString) {
        String encryptedString = null;
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
            encryptedString = new String(Base64.getEncoder().encode(encryptedText));
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return encryptedString;
    }

    public String decrypt(String encryptedString) {
        String decryptedText = null;
        try {
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] encryptedText = Base64.getDecoder().decode(encryptedString);
            byte[] plainText = cipher.doFinal(encryptedText);
            decryptedText = new String(plainText);
        } catch (Exception e) {
            LOGGER.error("Unable to decrypt your string.");
            //throw new EncryptedTokenNotValidExcepton("Unable to decrypt your string.");
        }
        return decryptedText;
    }
}

