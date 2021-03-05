package tests;
import com.company.encrypt;
import org.junit.*;
import static org.junit.Assert.*;

public class encryptTest {
    private encrypt  caesar = new encrypt();
    @Test
    public void ignoreEmptyStrings(){
        assertEquals("", caesar.encrypt("", 3));
    }
    public void readSentence(){
        String sentence ="hello world";
        assertEquals(sentence, caesar.encrypt(sentence, 3));

    }
}
