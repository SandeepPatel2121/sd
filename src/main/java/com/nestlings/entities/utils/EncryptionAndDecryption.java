
package com.nestlings.entities.utils;

import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author ú
 */
public class EncryptionAndDecryption {

    private EncryptionAndDecryption(){}

    public static String encrypt(String encryptString) {
        return new String(Base64.encodeBase64(encryptString.getBytes(StandardCharsets.UTF_8)));
    }

    public static String decrypt(String decryptString) {
        return new String(Base64.decodeBase64(decryptString.getBytes()));
    }
    
}
