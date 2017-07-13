import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(new Solution().removeKdigits("5337", 2), "33");
        assertEquals(new Solution().removeKdigits("1432219", 3), "1219");
        assertEquals(new Solution().removeKdigits("10200", 1), "200");
        assertEquals(new Solution().removeKdigits("10", 2), "0");
    }
}
