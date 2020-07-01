package educative.grookingCodingPatterns.slidingWindow;

import java.util.Arrays;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {
        final int subArraySize = 5;
        final int[] inputArray = new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        double[] result = MaxSumSubArrayOfSizeK.findAverages(subArraySize, inputArray);
        System.out.println(String.format("Input Array %s"+ "\n"+"Averages of sub-arrays of size %s : %s" , Arrays.toString(inputArray), subArraySize, Arrays.toString(result)));
    }

    public static double[] findAverages(int subArraySize, int[] inputArray){
        //Initialise the size of result and sliding window
        final double[] result = new double[inputArray.length - subArraySize +1];
        double slidingWindowSum = 0;
        //initialise outgoing index for collection of result and track of slider position
        int outGoingIndex = 0;
        for (int i = 0 ; i < inputArray.length ; i++){
            slidingWindowSum += inputArray[i];
            if(i >= subArraySize -1){
                result[outGoingIndex] = slidingWindowSum/subArraySize;
                slidingWindowSum -= inputArray[outGoingIndex];
                outGoingIndex ++;
            }
        }
    return result;
    }
}
