package educative.grookingCodingPatterns.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKDistinctChars {
    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + LongestSubStringWithKDistinctChars.findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + LongestSubStringWithKDistinctChars.findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + LongestSubStringWithKDistinctChars.findLength("cbbebi", 3));
    }

    private static int findLength(String input, int maxDistChar) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        int windowStIndex = 0;
        int maxLength = 0;
        for (int j = 0; j < input.length() ; j++) {
            char currChar = input.charAt(j);
            charCountMap.put(currChar, charCountMap.getOrDefault(currChar, 0) + 1 );
            if(charCountMap.size() > maxDistChar){
                char outgoingChar = input.charAt(windowStIndex);
                charCountMap.put(outgoingChar, charCountMap.get(currChar) - 1);
                if(charCountMap.get(outgoingChar) == 0) charCountMap.remove(outgoingChar);
                windowStIndex++;
            }
            maxLength = Math.max(maxLength, j - windowStIndex + 1);
        }
        return maxLength;
    }


}
