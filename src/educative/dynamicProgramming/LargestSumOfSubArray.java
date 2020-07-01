package educative.dynamicProgramming;

/**
 * Based on Kadane's algorithm..
 * current_max = A[0]
 * global_max = A[0]
 * for i = 1 -> size of A
 *     if current_max is less than 0
 *         then current_max = A[i]
 *     otherwise
 *         current_max = current_max + A[i]
 *     if global_max is less than current_max
 *         then global_max = current_max
 *
 * Additionally i added code to figure out start and end index for the subArray
 */
public class LargestSumOfSubArray {
    static int findMaxSumSubArray(int[] A) {
        if (A.length < 1) {
            return 0;
        }

        int currMax = A[0];
        int globalMax = A[0];
        int stIndex = 0;
        int endIndex = 0;
        for (int i = 1; i < A.length; ++i) {

            if (currMax < 0) {
                currMax = A[i];
                stIndex = 0;
            } else {
                currMax += A[i];
                if(stIndex == 0)
                    stIndex = i;
            }
            if (globalMax < currMax) {
                endIndex = i;
                globalMax = currMax;
            }
        }

        System.out.println("Beginning Index: " + stIndex + " End Index: " + endIndex);

        return globalMax;
    }
    public static void main(String[] args) {
        int[] v = new int[]{-4, 2, -5, 1, 2, 3, 6, -5, 1};
        System.out.println("Sum of largest subarray: " + findMaxSumSubArray(v));
    }
}