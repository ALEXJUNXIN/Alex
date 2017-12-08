package password;

import java.math.BigInteger;
import java.security.MessageDigest;


public class SHA {
     public static final String KEY_SHA = "SHA";   

    public static  String  getResult(String inputStr)
    {
        BigInteger sha =null;
        System.out.println("=======password before:"+inputStr);
        byte[] inputData = inputStr.getBytes();   
        try {
             MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);  
             messageDigest.update(inputData);
             sha = new BigInteger(messageDigest.digest());   
             System.out.println("After SHA:" + sha.toString(32));   
        } catch (Exception e) {e.printStackTrace();}
        return sha.toString(32);
    }

    public static void main(String args[])
    {
        try {
             String inputStr = "Alex Fung";   
             getResult(inputStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}