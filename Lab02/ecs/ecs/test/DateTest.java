import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

    @Test
    void nextDate_sample() {
      Date d = new Date(2020,5,3);
      assertEquals(new Date(2020,5,4), d.nextDate());
    }
    
    @Test
    void testTC1() {
        Date d = new Date(1700, 6, 20);
        Date next = d.nextDate();
        assertEquals(new Date(1700, 6, 21), next);
    }

    @Test
    void testTC9() {
        Date d = new Date(444, 2, 29); // Année bissextile
        Date next = d.nextDate();
        assertEquals(new Date(444, 3, 1), next);
    }

    @Test
    void testTC16() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(1500, 2, 31);
        });
    }
}