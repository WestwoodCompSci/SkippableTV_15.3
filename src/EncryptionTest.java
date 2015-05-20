import tv.skippable.encryption.Encryption;


public class EncryptionTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String myPass = "FortyTwo101010";
		String encPass = Encryption.encrypt(myPass);
		System.out.println(encPass.length());
		System.out.println(encPass);
		String dencPass = Encryption.decrypt(encPass);
		
		System.out.println("Password: "+ myPass);
		System.out.println("Encrypted Password: " + encPass);
		System.out.println("Decrypted Password: " + dencPass);
	}

}
