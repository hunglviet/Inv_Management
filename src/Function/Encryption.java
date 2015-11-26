/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author MINHPHUONG
 */
public class Encryption {
    String stringEncrypt;
    String stringDecrypt;
    
    public Encryption (){}
    
    /**
     * 
     * @param Encrypt
     * @return stringEncrypt: string after encryption
     * using algorithm MD5
     * use for encrypt password
     */
    public String EncryptOneWay(String plaintext)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plaintext.getBytes());
            byte raw[] = md.digest();
            this.stringEncrypt = (new Base64().encode(raw));
        }
        catch(Exception ex){}
        
        return stringEncrypt;
    }
    
    /**
     * 
     * @param plaintext
     * @return stringEncrypt
     * 
     */
    public String EncryptWithKey(String plaintext)
    {
        try
        {
            String keystring = "Thisisthekeytocryptstrin";//min 24 chars
            SecretKeyFactory skfactory = SecretKeyFactory.getInstance("DESede");
            SecretKey key = skfactory.generateSecret(new DESedeKeySpec(keystring.getBytes()));
            Cipher cipher = Cipher.getInstance("DESede");
            
            cipher.init(Cipher.ENCRYPT_MODE, key);
            stringEncrypt = DatatypeConverter.printBase64Binary(cipher.doFinal(plaintext.getBytes()));
            
//            String keyString = "1234567890";
//            byte[] key = keyString.getBytes();
//            byte[] ecr = plaintext.getBytes();
//            SecretKeySpec skp = new SecretKeySpec(key, "AES");
//            Cipher cipher = Cipher.getInstance("AES");
//            cipher.init(Cipher.ENCRYPT_MODE, skp);
//            byte[] stringenc = cipher.doFinal(ecr);
//            stringEncrypt = DatatypeConverter.printBase64Binary(stringenc);
            
        }
        catch(Exception ex){System.out.println(""+ex.toString());}
        
        return stringEncrypt;
    }
    
    public String DeCryptWitKey(String stringencrypt)
    {
        try
        {
            String keystring = "Thisisthekeytocryptstrin";
            SecretKeyFactory skfactory = SecretKeyFactory.getInstance("DESede");
            SecretKey sk = skfactory.generateSecret(new DESedeKeySpec(keystring.getBytes()));
            Cipher cipher = Cipher.getInstance("DESede");
            
            cipher.init(Cipher.DECRYPT_MODE, sk);
            //byte[] decbyte = cipher.doFinal(stringencrypt.getBytes());
            stringDecrypt = new String(cipher.doFinal(DatatypeConverter.parseBase64Binary(stringencrypt)));
//            String keyString = "1234567890";
//            byte[] key = keyString.getBytes();
//            byte[] ecr = stringencrypt.getBytes();
//            SecretKeySpec skp = new SecretKeySpec(key, "AES");
//            Cipher cipher = Cipher.getInstance("AES");
//            cipher.init(Cipher.DECRYPT_MODE, skp);
//            byte[] stringdenc = cipher.doFinal(ecr);
//            stringDecrypt = stringdenc.toString();
        }
        catch(Exception ex){System.out.println(""+ex.toString());
           // System.out.println(""+ex.);
        }
        
        return stringDecrypt;
    }
    
}
