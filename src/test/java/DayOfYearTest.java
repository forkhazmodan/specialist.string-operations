import Converter.DayOfYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfYearTest {

    @Test
    void convert() throws Exception {
        assertEquals(new DayOfYear(2004, 59).convert(), "2004 59 February 28");
        assertEquals(new DayOfYear(2004, 60).convert(), "2004 60 February 29");
        assertEquals(new DayOfYear(2004, 61).convert(), "2004 61 March 1");
        assertEquals(new DayOfYear(1999, 91).convert(), "1999 91 April 1");
        assertEquals(new DayOfYear(2000, 91).convert(), "2000 91 March 31");
        assertEquals(new DayOfYear(2174, 156).convert(), "2174 156 June 5");
    }

    @Test
    void convertFails() {
        assertThrows(Exception.class, () -> {
            new DayOfYear(-200, 59);
        });
        assertThrows(Exception.class, () -> {
            new DayOfYear(200, 500);
        });
        assertThrows(Exception.class, () -> {
            new DayOfYear(200, 0);
        });
    }
}