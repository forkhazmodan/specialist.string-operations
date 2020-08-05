import Converter.Converter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void convert() throws Exception {
        assertEquals(new Converter(2004, 59).convert(), "2004 59 February 28");
        assertEquals(new Converter(2004, 60).convert(), "2004 60 February 29");
        assertEquals(new Converter(2004, 61).convert(), "2004 61 March 1");
        assertEquals(new Converter(1999, 91).convert(), "1999 91 April 1");
        assertEquals(new Converter(2000, 91).convert(), "2000 91 March 31");
        assertEquals(new Converter(2174, 156).convert(), "2174 156 June 5");
    }

    @Test
    void convertFails() {
        assertThrows(Exception.class, () -> {
            new Converter(-200, 59);
        });
        assertThrows(Exception.class, () -> {
            new Converter(200, 500);
        });
        assertThrows(Exception.class, () -> {
            new Converter(200, 0);
        });
    }
}