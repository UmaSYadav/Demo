package practice.java8.base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Enhances {

	public static void main(String[] args) {
		
		String vInputStr= "Uma Shankar Yadav";
		String vUrl= "https://www.javatpoint.com/java-base64-encode-decode";
		String vVarStr= "Hello, Uma Shankar Yadav,\n Greetings.";
		
		Decoder vMimeDecoder= Base64.getMimeDecoder();
		Encoder vMimeEncoder= Base64.getMimeEncoder();
		//Encoder vMimeDecoder2= Base64.getMimeEncoder(0, null);
		Encoder vEncoder= Base64.getEncoder();
		Decoder vDecoder= Base64.getDecoder();
		Encoder vUrlEncoder= Base64.getUrlEncoder();
		Decoder vUrlDecoder= Base64.getUrlDecoder();
		
		String vEncodedUrl= vUrlEncoder.encodeToString(vUrl.getBytes());
		System.out.println("Url encoder: "+vEncodedUrl);
		String vDecodeUrl= new String(vUrlDecoder.decode(vEncodedUrl));
		System.out.println("Url decoder: "+vDecodeUrl);
		
		byte[] vEncodedByte= vEncoder.encode(vInputStr.getBytes());
		String vEncodedVal= new String(vEncodedByte);
		System.out.println("String encoded: "+vEncodedByte+" -- "+vEncodedVal);
		byte[] vDecodeByte= vDecoder.decode(vEncodedVal);
		String vDecodedVal= new String(vDecodeByte);
		System.out.println("String decoded: "+vDecodeByte+" -- "+vDecodedVal);
		
		byte[] vMimeEncodedBytes= vMimeEncoder.encode(vVarStr.getBytes());
		String vMimeEncVal= new String(vMimeEncodedBytes);
		System.out.println("Mime encoded: "+vMimeEncodedBytes+" -- "+vMimeEncVal);
		byte[] vMimeDecodedBytes= vMimeDecoder.decode(vMimeEncodedBytes);
		String vMimeDecVal= new String(vMimeDecodedBytes);
		System.out.println("Mime encoded: "+vMimeDecodedBytes+" -- "+vMimeDecVal);
		
	}
	

}
