import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int size = nums.length;
        BigInteger filterSpace = BigInteger.ONE;
        filterSpace = filterSpace.shiftLeft(size);
        BigInteger[] xorFilters = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            xorFilters[i] = BigInteger.ONE.shiftLeft(i);
        }

        for (BigInteger filter = BigInteger.ZERO; filter.compareTo(filterSpace) < 0; filter = filter.add(BigInteger.ONE)) {
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (filter.and(xorFilters[i]).compareTo(BigInteger.ZERO) > 0)
                    subList.add(nums[i]);
            }
            result.add(subList);
        }

        return result;
    }
}