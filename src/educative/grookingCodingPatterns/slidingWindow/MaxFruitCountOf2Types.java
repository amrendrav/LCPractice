package educative.grookingCodingPatterns.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {

    public static void main(String[] args) {
        System.out.println("Maximum number of fruits: " +
                MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'A', 'C' }, 2));
        System.out.println("Maximum number of fruits: " +
                MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C'}, 2));
    }

    private static int findLength(char[] chars, int fruitTypeCount) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        int maxFruitCounts = 0;
        int slidingWindowOutgoingIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            charCountMap.put(chars[i], charCountMap.getOrDefault(chars[i], 0) + 1 );

            while(charCountMap.size() > fruitTypeCount){
                charCountMap.put(chars[slidingWindowOutgoingIndex], charCountMap.getOrDefault(chars[slidingWindowOutgoingIndex], 0) - 1);
                if(charCountMap.get(chars[slidingWindowOutgoingIndex]) == 0){
                    charCountMap.remove(chars[slidingWindowOutgoingIndex]);
                }
                slidingWindowOutgoingIndex ++;
            }
            maxFruitCounts = Math.max(maxFruitCounts, i - slidingWindowOutgoingIndex + 1);
        }
        return maxFruitCounts;

    }

}
