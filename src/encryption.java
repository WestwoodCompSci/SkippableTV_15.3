import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import sun.misc.*;

public class Encryption {
	private static final String ALGO = "AES";
	private static final byte[] keyValue = new byte[]{'F','O','R','T','Y','T','W','O'};
	public static String encrypt(String DATA) throws Exception
	{
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = c.doFinal(DATA.getBytes());
		String encryptedValue = new BASE64Encoder().encode(encVal);
		return encryptedValue;
	}
	public static String decrypt(String DATA) throws Exception
	{
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.DECRYPT_MODE,key);
		byte[] dencVal = c.doFinal(DATA.getBytes());
		String decryptedValue = new BASE64Encoder().encode(dencVal);
		return decryptedValue;
		
	}
	public static Key generateKey()
	{
		Key key = new SecretKeySpec(keyValue,ALGO);
		return key;
	}
}
