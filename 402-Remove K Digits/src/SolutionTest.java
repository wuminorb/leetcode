import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        System.out.println(new String("5 D; a1 e  l' i7 T"));
        assertEquals(new Solution().removeKdigits("5337", 2), "33");
        assertEquals(new Solution().removeKdigits("1432219", 3), "1219");
        assertEquals(new Solution().removeKdigits("10200", 1), "200");
        assertEquals(new Solution().removeKdigits("10", 2), "0");
    }
}
