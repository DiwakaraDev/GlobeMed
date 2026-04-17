package SecurityDecorator;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptionDecorator extends DataServiceDecorator {

    private static final String AES_KEY = "GlobeMed@SecKey1";
    private static final String ALGORITHM = "AES";

    public EncryptionDecorator(DataService service) {
        super(service);
    }

    @Override
    public void writeData(String key, String value) {
        String encrypted = encrypt(value);
        System.out.println("[ENCRYPTION] Data AES-encrypted before storage.");
        wrappedService.writeData(key, encrypted);
    }

    @Override
    public String readData(String key) {
        String encrypted = wrappedService.readData(key);
        if (encrypted == null) {
            return null;
        }
        System.out.println("[ENCRYPTION] Data AES-decrypted after retrieval.");
        return decrypt(encrypted);
    }

    @Override
    public String getServiceDescription() {
        return wrappedService.getServiceDescription() + " + AES-EncryptionLayer";
    }

    private String encrypt(String plainText) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(AES_KEY.getBytes("UTF-8"), ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            System.err.println("[ENCRYPTION] Encrypt error: " + e.getMessage());
            return plainText;
        }
    }

    private String decrypt(String cipherText) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(AES_KEY.getBytes("UTF-8"), ALGORITHM);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
            return new String(decryptedBytes, "UTF-8");
        } catch (Exception e) {
            System.err.println("[ENCRYPTION] Decrypt error: " + e.getMessage());
            return cipherText;
        }
    }
}
