import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Password implements Encryptable {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public void encrypt() {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            password = hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String decrypt() {
        return password;
    }

    public String toString() {
        return "Password{" +
                "password='" + password + '\'' +
                '}';
    }
}