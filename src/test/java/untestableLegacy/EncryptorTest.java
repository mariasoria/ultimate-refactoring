package untestableLegacy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class EncryptorTest {
    Encryptor encryptor = new Encryptor();
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Test(expected = InvalidParameterException.class)
    public void cryptWord() {
        encryptor.cryptWord("f ka ");
    }

    @Test
    public void cryptWord_should_encrypt(){
        assertEquals("c", encryptor.cryptWord("a"));
    }

    @Test
    public void cryptWordToNumbers() {
        assertEquals("99", encryptor.cryptWordToNumbers("a"));
    }

    @Test
    public void testCryptWord() {
        assertEquals("rwben", encryptor.cryptWord("ruben", "u"));
    }

    @Test
    public void cryptSentence() {
        assertEquals("octkc\"{\"twdgp", encryptor.cryptSentence("maria y ruben"));
    }

    @Test
    public void getWords() {
        assertArrayEquals (new String[]{"Ola","k","ase"}, "Ola k ase".split(" "));
    }


    @Test
    public void printWords() {
        System.setOut(new PrintStream(outputStream));
        encryptor.printWords("cosa mariposa");
        assertEquals("<cosa><mariposa>", outputStream.toString());
    }
}