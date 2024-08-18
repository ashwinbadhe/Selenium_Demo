package Demos;

import org.bouncycastle.util.encoders.Base64;

public class Encode_Paassword_sensivite_Data {

	public static void main (String[] args) {
		
		
		String password = "Admin@2024";
	
		byte [] encodedpassword = Base64.encode(password.getBytes());
		
		System.out.println(new String(encodedpassword));
		
		byte [] a = Base64.decode(encodedpassword);
		System.out.println(new String(a));
	}
	
	
}
