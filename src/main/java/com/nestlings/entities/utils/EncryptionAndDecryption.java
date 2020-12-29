
package com.nestlings.entities.utils;

import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author ú
 */
public class EncryptionAndDecryption {
    
    public static String encrypt(String encryptString) {
        String encode = new String(Base64.encodeBase64(encryptString.getBytes(StandardCharsets.UTF_8)));
        return encode;
    }

    public static String decrypt(String decryptString) {
        String decode = new String(Base64.decodeBase64(decryptString.getBytes()));
        return decode;
    }
    
}
