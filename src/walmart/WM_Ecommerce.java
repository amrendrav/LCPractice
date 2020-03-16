package walmart;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Given an array of integers, perform some number k of operations.
 * Each operation consists of removing any element from the array,
 * dividing it by 2 and inserting the ceiling of that result back into the array.
 * Minimize the sum of the elements in the final array.
 * Example:
 * nums = [10, 20, 7]
 *
 * k = 4
 *
 * Pick    Pick/2    Ceiling         Result
 *
 * Initial array                             [10, 20, 7]
 * 7          3.5             4              [ 10, 20, 4]
 * 10         5               5              [5, 20, 4]
 * 20        10               10             [5, 10, 4]
 * 10        5                5              [5, 5, 4]
 * The sum of the final array is 5 + 5 + 4 = 14, and that sum is minimal.
 *
 * Function Description
 * Complete the function minSum in the editor below.
 * minSum has the following parameters:
 *
 *     int nums[n]:  an array of integers, indexed 0 to n-1
 *     int k:  an integer
 *
 * Returns
 *     int:  the minimum sum of the array after k steps
 * Constraints
 *
 * 1 ≤ n ≤ 105
 * 1 ≤ num[i] ≤ 104 (where 0 ≤ i < n)
 * 1 ≤ k ≤ 107
 */
public class WM_Ecommerce {

    public static void main(String[] args) {
        int[] iArr = {5, 10, 5, 20};
        //int[] iArr = {10, 7, 20};

        System.out.println("Minimum Sum: " +returnMinSum(iArr, 5));
    }

    private static int returnMinSum(int[] iArr, int k) {
        final int arrayLength = iArr.length - 1;
        for(int i = 0 ; i < k ; i ++){
            //S1
            /*Random random = new Random();
            int index = random.nextInt(iArr.length);
            int temp = iArr[index];*/
            //S2
            Arrays.sort(iArr);
            int temp = iArr[arrayLength];
            iArr[arrayLength]= getUpperCeilingNumber(temp);
            //IntStream.of(iArr).forEach(s -> System.out.print(s + " "));
            //System.out.println(" ");
        }

        return Arrays.stream(iArr).sum();
    }

    private static int getUpperCeilingNumber(int inputInt){
       return (int)Math.ceil(inputInt/2);
    }

}
