package SecurityDecorator;

import java.util.Base64;

public class EncryptionDecorator extends DataServiceDecorator {

    public EncryptionDecorator(DataService service) {
        super(service);
    }

    @Override
    public void writeData(String key, String value) {
        String encrypted = encrypt(value);
        System.out.println("[ENCRYPTION] Data encrypted before storage");
        wrappedService.writeData(key, encrypted);
    }

    @Override
    public String readData(String key) {
        String encrypted = wrappedService.readData(key);
        if (encrypted == null) {
            return null;
        }
        System.out.println("[ENCRYPTION] Data decrypted after retrieval");
        return decrypt(encrypted);
    }

    @Override
    public String getServiceDescription() {
        return wrappedService.getServiceDescription() + " + EncryptionLayer";
    }

    private String encrypt(String plainText) {
        return Base64.getEncoder().encodeToString(plainText.getBytes());
    }

    private String decrypt(String cipherText) {
        return new String(Base64.getDecoder().decode(cipherText));
    }
}
