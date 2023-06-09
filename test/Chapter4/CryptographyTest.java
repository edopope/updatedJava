package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {

    @BeforeEach
    public void setUP(){

    }


    @Test
    public void encrypt() {
        String encryptedCode = Cryptography.encrypt(4132);
assertEquals(new String("0918"),encryptedCode);

    }
    @Test
    public void decrypt() {
        int encryptedCode = Cryptography.decrypt(2981);
        assertEquals(1452,encryptedCode);

    }
}
