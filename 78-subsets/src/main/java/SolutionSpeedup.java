import java.util.ArrayList;
import java.util.List;

public class SolutionSpeedup {
    private static final int[] pbs = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int size = nums.length;
        int filterSpace = 1;
        filterSpace = filterSpace << size;
        for (int filter = 0; filter < filterSpace; filter++) {
            List<Integer> subList = new ArrayList<>();
            int maxP = (int) (Math.log(filter) / Math.log(2) + 2);
            for (int i = 0; i < maxP; i++) {
                if ((filter & pbs[i]) > 0)
                    subList.add(nums[i]);
            }
            result.add(subList);
        }

        return result;
    }
}