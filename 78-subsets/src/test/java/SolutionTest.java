import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test() {
        List<List<Integer>> result = new Solution().subsets(new int[]{1, 2, 3});
        System.out.println(result);
        System.out.println("[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]".equals(result.toString()));
        byte[] pbs = new byte[]{1, 2, 4, 8, 16, 32, 64, (byte) 10000000};
        System.out.println(pbs[7]);
    }
}