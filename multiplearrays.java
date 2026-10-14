
import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums[0]) {
            boolean foundInAll = true;

            for (int i = 1; i < nums.length; i++) {
                boolean found = false;

                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == num) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    foundInAll = false;
                    break;
                }
            }

            if (foundInAll && !result.contains(num)) {
                result.add(num);
            }
        }

        Collections.sort(result);
        return result;
    }
}
