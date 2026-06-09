import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest {
    private int y, m, d;
    public DateNextDateExceptionTest(int y, int m, int d) { this.y = y; this.m = m; this.d = d; }
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1500, 2, 31}, {1500, 2, 29}, {-1, 10, 20}, {1458, 15, 12}, {1975, 6, -50}
        });
    }
    @Test(expected = IllegalArgumentException.class)
    public void testException() { new Date(y, m, d); }
}