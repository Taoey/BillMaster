package com.tao.modules.common.utils;


import com.thoughtworks.xstream.core.util.Base64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

public class DESUtil {
    public static Key KEY=null;
    public static String KEY_STRING="abc";
    static{
        try {
            KeyGenerator generator = KeyGenerator.getInstance("DES");
            SecureRandom random=SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(KEY_STRING.getBytes());
            generator.init(random);
            KEY=generator.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String encode(String in){
        Base64Encoder encoder=new Base64Encoder();
        String out=null;
        try {
            Cipher cipher=Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, KEY);
            out= encoder.encode(cipher.doFinal(in.getBytes()));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
    public static String decode(String in){
        Base64Encoder encoder=new Base64Encoder();
        String out=null;
        try {
            Cipher cipher=Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, KEY);
            out=new String(cipher.doFinal(encoder.decode(in)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(encode("123456"));//67pD7puy6t8=
        System.out.println(decode("67pD7puy6t8="));
    }
}