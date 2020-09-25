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
    public void should_show_a_word_encrypted(){
        assertEquals("c", encryptor.cryptWord("a"));
    }

    @Test
    public void should_show_a_number_as_string() {
        assertEquals("99", encryptor.cryptWordToNumbers("a"));
    }

    @Test
    public void should_replace_and_encrypt_some_chars() {
        assertEquals("rwben", encryptor.cryptWord("ruben", "u"));
    }

    @Test
    public void should_encrypt_a_sentence() {
        assertEquals("octkc\"{\"twdgp", encryptor.cryptToChars("maria y ruben"));
    }

    @Test
    public void should_split_the_words_in_a_sentence() {
        assertArrayEquals (new String[]{"Ola","k","ase"}, "Ola k ase".split(" "));
    }


    @Test
    public void should_wrap_the_words_of_a_sentence() {
        System.setOut(new PrintStream(outputStream));
        encryptor.printWords("cosa mariposa");
        assertEquals("<cosa><mariposa>", outputStream.toString());
    }
}