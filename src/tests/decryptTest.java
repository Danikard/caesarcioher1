package tests;

import com.company.decrypt;
import org.junit.*;
import static org.junit.Assert.*;


public class decryptTest {
    private decrypt caesar = new decrypt();
    @Test
    public void ignoreEmptyStrings(){
        assertEquals("", caesar.decrypt("", 3));
    }
    public void readSentence(){
        String sentence ="hello world";
        assertEquals(sentence, caesar.decrypt(sentence, 3));

    }
}
