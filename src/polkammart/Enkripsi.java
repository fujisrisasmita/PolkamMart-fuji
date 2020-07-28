/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polkammart;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author oryza
 */
public class Enkripsi {
    public String encryptPasswordMD5(String pesan){
        byte[] bytePesan = pesan.getBytes();
        MessageDigest md = null;
        String encPass;
        try{
            md=MessageDigest.getInstance("MD5");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        byte[] hasil = md.digest(bytePesan);
        return encPass=byteArrToString(hasil);
    }
    
      private static String byteArrToString(byte[] b) {
        
        StringBuilder sb = new StringBuilder(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            int j = b[i] & 0xff;
            if (j < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(j));
        }
        String res = sb.toString();
        return res.toUpperCase();
      }
}
