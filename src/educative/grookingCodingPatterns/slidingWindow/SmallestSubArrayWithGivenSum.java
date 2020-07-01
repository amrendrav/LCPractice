package educative.grookingCodingPatterns.slidingWindow;

import java.util.Arrays;

public class SmallestSubArrayWithGivenSum {

    public static void main(String[] args) {
        final int subArraySum = 7;
        final int[] inputArray = new int[] { 2, 1, 5, 2, 3, 2 };
        int result = SmallestSubArrayWithGivenSum.findSmallestSubArraySize(subArraySum, inputArray);
        System.out.println(String.format("Input Array %s"+ "\n"+"Smallest SubArray size of sum %s : %s" , Arrays.toString(inputArray), subArraySum,result));
    }

    private static int findSmallestSubArraySize(int subArraySum, int[] inputArray) {
        int slidingWindowSum = 0;
        int windowStartIndex = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i <inputArray.length ; i++) {
            slidingWindowSum += inputArray[i];
            while(slidingWindowSum >= subArraySum){
                minLength = Math.min(minLength, i - windowStartIndex +1);
                slidingWindowSum -= inputArray[windowStartIndex];
                windowStartIndex++;
            }
        }
        return minLength;
    }

}
