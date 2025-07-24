// SecurityManager Class
public class SecurityManager {

    // Method to authenticate a user with a specific method
    public void authenticate(String user, String method) {
        System.out.println("Authenticating " + user + " using " + method + "...");
        // Simulate authentication logic
        if ("Multi-Factor Authentication".equalsIgnoreCase(method)) {
            System.out.println(user + " has been successfully authenticated using Multi-Factor Authentication.");
        } else {
            System.out.println(user + " authentication failed. Unsupported method: " + method);
        }
    }

    // Method to encrypt data
    public String encrypt(String data) {
        // Simulate encryption logic
        String encryptedData = "Encrypted(" + data + ")";
        System.out.println("Encrypting data: " + data);
        System.out.println("Encrypted data: " + encryptedData);
        return encryptedData;
    }

    // Method to decrypt data
    public String decrypt(String encryptedData) {
        // Simulate decryption logic
        if (encryptedData.startsWith("Encrypted(") && encryptedData.endsWith(")")) {
            String decryptedData = encryptedData.substring(10, encryptedData.length() - 1);
            System.out.println("Decrypting data: " + encryptedData);
            System.out.println("Decrypted data: " + decryptedData);
            return decryptedData;
        } else {
            System.out.println("Invalid encrypted data format.");
            return null;
        }
    }
}
