package day1;

import java.security.MessageDigest;

public class StringUtil {

    // Applies Sha256 to a string and returns the result.
    public static String applySha256(String input) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            //Applies sha256 to our input,
            byte[] hash = messageDigest.digest(input.getBytes("UTF-8"));
            StringBuilder hexString  = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
