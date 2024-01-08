package Javalab4_2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecoderTest {
    @Test
    public void testDecodeVowels() {
        assertEquals("testing", Decoder.decodeVowels("t2st3ng"));
        assertEquals("aeiou", Decoder.decodeVowels("12345"));
    }

    @Test
    public void testDecodeConsonants() {
        assertEquals("testing", Decoder.decodeConsonants("uftujoh"));
        assertEquals("hello world", Decoder.decodeConsonants("ifmmp xpsme"));

    }
}

