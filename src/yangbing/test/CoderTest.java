package yangbing.test;

import static org.junit.Assert.*;

import java.math.BigInteger;


import yangbing.dao.tools.Coder;

public class CoderTest {
	public static void main(String[] args) throws Exception {
		String inputStr = "123456";
		System.err.println("原文:\n" + inputStr);

		byte[] inputData = inputStr.getBytes();
		String code = Coder.encryptBASE64(inputData);

		System.err.println("BASE64加密后:\n" + code);

		byte[] output = Coder.decryptBASE64(code);

		String outputStr = new String(output);

		System.err.println("BASE64解密后:\n" + outputStr);

		String key = Coder.initMacKey();
		System.err.println("Mac密钥:\n" + key);

		BigInteger md5 = new BigInteger(Coder.encryptMD5(inputData));
		System.err.println("MD5:\n" + md5.toString(16));

		BigInteger sha = new BigInteger(Coder.encryptSHA(inputData));
		System.err.println("SHA:\n" + sha.toString(32));

		BigInteger mac = new BigInteger(Coder.encryptHMAC(inputData, inputStr));
		System.err.println("HMAC:\n" + mac.toString(16));
	}
}