import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionSpeedupTest {
    @Test
    public void test() {
        assertEquals(new SolutionSpeedup().removeKdigits("10200", 1), "200");
        assertEquals(new SolutionSpeedup().removeKdigits("5337", 2), "33");
        assertEquals(new SolutionSpeedup().removeKdigits("1432219", 3), "1219");
        assertEquals(new SolutionSpeedup().removeKdigits("10", 2), "0");
        for (int i = 0; i < 10000000; i++) {
            new SolutionSpeedup().removeKdigits("14322194235673413", 7);
        }
    }
}
