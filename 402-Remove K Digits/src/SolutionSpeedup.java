import java.util.Arrays;

public class SolutionSpeedup {
    public String removeKdigits(String num, int k) {
        if (num == null || num.length() == 0 || num.length() <= k)
            return "0";

        int length = num.length();
        int endIndex = length - k;
        char[] result = new char[endIndex];
        char[] context = num.toCharArray();
        int hasNum = 1;
        result[0] = context[0];
        if (result[0] == '0') {
            endIndex--;
        }

        for (int i = 1; i < length; i++) {
            if (result[0] == '0') {
                if (context[i] == '0') {
                    endIndex--;
                } else {
                    result[0] = context[i];
                }
                continue;
            }
            int left = i - length + endIndex < 0 ? 0 : i - length + endIndex;
            for (int j = left; j < endIndex; j++) {
                if (j >= hasNum) {
                    hasNum++;
                    result[j] = context[i];
                    break;
                }
                if (result[j] > context[i]) {
                    hasNum = j + 1;
                    result[j] = context[i];
                    if (j == 0 && context[i] == '0')
                        endIndex--;
                    break;
                }
            }
        }

        String resultString = new String(Arrays.copyOfRange(result, 0, endIndex));
        return resultString.equals("") ? "0" : resultString;
    }
}