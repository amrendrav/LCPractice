package self.array;

/**
 * Max sum of subsequence of non adjecent integers in given array
 */
public class MaxSum_Non_Consecutive {

    public static void main(String[] args) {
        System.out.println(sumOfMaxSubsequence(new int[] {1, 6, 10, 14, -5, -1, 2, -1, 3}));
    }

public static int sumOfMaxSubsequence(int[] iArray){
        if(iArray.length == 0) return 0;
        if(iArray.length == 1) return iArray[0];

        int[] resultArray = new int[iArray.length];

        for(int i = 1; i < iArray.length ; i++){

            resultArray[i] = Math.max(iArray[i], resultArray[i-1]);

            if(i-2 >= 0){
                resultArray[i] = Math.max(resultArray[i], iArray[i] + resultArray[i-2]);
            }
        }
        return resultArray[resultArray.length - 1];
}

}
