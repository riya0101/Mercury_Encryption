package PseudoCode;

import java.io.IOException;

import org.apache.xmlbeans.impl.util.Base64;
import org.testng.annotations.Test;

import MasterPage.TestBase;

public class encrypt extends TestBase {
	

	public static byte[] encoded_user_name;
	public static byte[] decoded_user_name;
	
	public encrypt() throws IOException {
		super();

	}

	public static String doEncrypt()
	{
		encoded_user_name=Base64.encode(prop.getProperty("password").getBytes());
		return new String(encoded_user_name);
	}
	
	public static String doDecrypt(String encoded)
	{
		decoded_user_name=Base64.decode(encoded.getBytes());
		return new String(decoded_user_name);
		
	}
}

