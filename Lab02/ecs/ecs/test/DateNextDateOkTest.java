import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest {
    private int y, m, d, expectedY, expectedM, expectedD;

    public DateNextDateOkTest(int y, int m, int d, int ey, int em, int ed) {
        this.y = y; this.m = m; this.d = d;
        this.expectedY = ey; this.expectedM = em; this.expectedD = ed;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 1700, 6, 20, 1700, 6, 21 }, //TC1
            { 2005, 4, 15, 2005, 4, 16 }, // TC2
            { 1901, 7, 20, 1901, 7, 21 }, // TC3
            { 3456, 3, 27, 3456, 3, 28 }, // TC4
            { 1500, 2, 17, 1500, 2, 18 }, // TC5
            { 1700, 6, 29, 1700, 6, 30 }, // TC6
            { 1800, 11, 29, 1800, 11, 30 }, // TC7
            { 3453, 1, 29, 3453, 1, 30 }, // TC8
            { 444, 2, 29, 444, 3, 1 },    // TC9
            { 2005, 4, 30, 2005, 5, 1 },  // TC10
            { 3453, 1, 30, 3453, 1, 31 }, // TC11
            { 3456, 3, 30, 3456, 3, 31 }, // TC12
            { 1901, 7, 31, 1901, 8, 1 },  // TC13
            { 3453, 1, 31, 3453, 2, 1 },  // TC14
            { 3456, 12, 31, 3457, 1, 1 }  // TC15
        });
    }

    @Test
    public void testNextDate() {
        Date actual = new Date(y, m, d).nextDate();
        assertEquals(new Date(expectedY, expectedM, expectedD), actual);
    }
}