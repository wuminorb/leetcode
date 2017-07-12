import org.junit.Test;

public class SolutionSpeedupTest {
    @Test
    public void test() {
        System.out.println(new SolutionSpeedup().subsets(new int[]{9, 0, 3, 5, 7}));
        for (int i = 0; i < 20000; i++) {
            new SolutionSpeedup().subsets(new int[]{1, 2, 3, 4, 1, 2, 3, 5});
            new SolutionSpeedup().subsets(new int[]{1, 2, 3});
            new SolutionSpeedup().subsets(new int[]{1, 2, 3, 4, 5});
            new SolutionSpeedup().subsets(new int[]{1, 2, 3, 4, 5, 6});
            new SolutionSpeedup().subsets(new int[]{1, 2, 3, 5, 6, 7});
            new SolutionSpeedup().subsets(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10});
        }
    }
}