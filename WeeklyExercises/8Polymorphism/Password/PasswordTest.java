public class PasswordTest {
    public static void main(String[] args) {
        Encryptable secretOrPassword = new Secret("My secret message");
        System.out.println("Secret before encryption: " + secretOrPassword);
        secretOrPassword.encrypt();
        System.out.println("Secret after encryption: " + secretOrPassword);
        secretOrPassword.decrypt();
        System.out.println("Secret after decryption: " + secretOrPassword);

        secretOrPassword = new Password("My password");
        System.out.println("Password before encryption: " + secretOrPassword);
        secretOrPassword.encrypt();
        System.out.println("Password after encryption: " + secretOrPassword);
        secretOrPassword.decrypt();
        System.out.println("Password after decryption: " + secretOrPassword);
    }
}