public class Solution {
    public String removeKdigits(String num, int k) {
        int length = num.length();
        int startIndex = 0;
        int endIndex = k;
        String result = "";

        for (int i = 0; i < length - k; i++) {
            int minNumIndex = getMinNumIndex(num, startIndex, endIndex);
            if (!(result.equals("") && num.charAt(minNumIndex) == '0'))
                result += num.charAt(minNumIndex);
            startIndex = minNumIndex + 1;
            endIndex++;
        }
        return result.equals("") ? "0" : result;
    }

    private int getMinNumIndex(String num, int startIndex, int endIndex) {
        int minNumIndex = startIndex;
        char minNum = num.charAt(startIndex);

        for (int i = startIndex; i <= endIndex; i++) {
            if (num.charAt(i) < minNum) {
                minNumIndex = i;
                minNum = num.charAt(i);
            }
        }

        return minNumIndex;
    }
}