package onlineTest.guidewire;

import java.security.InvalidParameterException;
import java.util.stream.IntStream;

public class FindMaxAmplitude_Q1 {

    public static void main(String[] args) {
        int[] iArr1 = {-3, -14, -5, 7, 8, 42, 8, 3};

        System.out.println(findMaxAmplitudeSeason(iArr1));
    }

    private static String findMaxAmplitudeSeason(int[] iArr1) {
        String [] sArray = {"WINTER", "SPRING", "SUMMER", "AUTUMN"};

        //Check if the input array is correct?
        if((iArr1.length%4) == 0){
            //Initialise result index with 0, Since WINTER is default;
            int resultIndex = 0;
            final int eachArrayCount = (iArr1.length / 4);
            int previousAmplitude = Integer.MIN_VALUE;

            //For each season find amplitude
            for (int i = 0; i < 4  ; i++) {
                //Each season Amplitude
                int currentAmplitude = IntStream.of(iArr1).skip(eachArrayCount*i).limit(eachArrayCount).max().getAsInt() -
                        IntStream.of(iArr1).skip(eachArrayCount*i).limit(eachArrayCount).min().getAsInt();

                System.out.println("Max amplitude of " + sArray[i] + " : " + currentAmplitude);
                //Find Max Amplitude of 4 season
                if(currentAmplitude > previousAmplitude){
                    previousAmplitude = currentAmplitude;
                    resultIndex = i;
                }

            }
            return sArray[resultIndex];
        }else
            throw new InvalidParameterException("Invalid Params Passed as parameters");

    }
}
