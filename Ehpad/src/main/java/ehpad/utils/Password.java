package ehpad.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Password {
	
	public static String Encrypt(String password) {
		String sha3Hex = new DigestUtils("SHA3-256").digestAsHex(password);
		return sha3Hex;
	}
}
