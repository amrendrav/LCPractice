package self.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Find fist pair of number whose sum equals given target
 */
public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 8, 9, 11}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Indexes: "+ map.get(complement) + " and : " +  i );
                System.out.println("Numbers: "+ complement + " and : " +  nums[i] );
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No pair sum found");
    }
}
