package Utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

public class Time {

	public static void main(String[] args) {
		
		System.out.println(Instant.now());
		System.out.println(getSHA("345177925488348"));
		
	}
	

    public static String getSHA(String input) 
    { 
  
        try { 
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            BigInteger no = new BigInteger(1, messageDigest);  
            String hashtext = no.toString(16); 
  
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
  
            return hashtext; 
        } 
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            System.out.println("Exception thrown"
                               + " for incorrect algorithm: " + e); 
  
            return null; 
        } 
    } 

}
