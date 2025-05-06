package solutions.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15, 3}, 10)));

    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) return new int[]{map.get(complement),i};

            map.put(nums[i], i);

        }

        return new int[]{};

    }
}