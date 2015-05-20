import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.security.*;
import java.util.Arrays;

import sun.misc.*;

public class Encryption {
	private static final String ALGO = "AES";
	private static final byte[] keyValue = new byte[]{'F','O','R','T','Y','T','W','O','F','O','R','T','Y','T','W','O'};
	private static Key key = generateKey();
	private static String encryptedValue;
	public static String encrypt(String DATA) throws Exception
	{
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = c.doFinal(DATA.getBytes());
		encryptedValue = new BASE64Encoder().encode(encVal);
		return encryptedValue;
	}
	public static String decrypt(String DATA) throws Exception
	{
		System.out.println(DATA.length());
		Cipher c = Cipher.getInstance(ALGO);
		byte[] decryptedValue = new BASE64Decoder().decodeBuffer(encryptedValue);
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] dencVal = c.doFinal(decryptedValue);
		String dencReturn=""; 
		for(byte x:dencVal)
		{
			dencReturn += (char)x;
		}
		return dencReturn;
		
	}
	public static Key generateKey()
	{
		Key key = new SecretKeySpec(keyValue,"AES");
		return key;
	}
}
