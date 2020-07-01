package educative.grookingCodingPatterns.slidingWindow;

import java.util.Arrays;
import java.util.List;

public class NoRepeatSubstring {

    public static void main(String[] args) {
        java8test();
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("aabccbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abbbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abccde"));
    }

    private static int findLength(String aabccbb) {
        return 0;
    }


    private static void java8test(){
        List<String> jList = Arrays.asList("j", "a", "v", "a");
        System.out.println("Test 1: reduce: "+jList.stream().reduce("", (a,b) -> a.concat(b)));

        List<String> allStrings = Arrays.asList("Java 6", "Java 7", "Java 8");
        boolean result = allStrings.stream().allMatch(obj -> {
            System.out.print(obj);
            return obj.contains("8");
        });
        System.out.println(" Test 2: allMatch: " + result);

    }


}
