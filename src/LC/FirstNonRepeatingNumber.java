package LC;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FirstNonRepeatingNumber {

    public static void main(String[] args) {
        final String inputString = "AAMMMREENDRA";
        System.out.println(findFirstNonRepeatingChar(inputString));
    }

    private static char findFirstNonRepeatingChar(String inputString){
        char[] cArr = inputString.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();
        //Break condition
        IntStream.range(0, cArr.length).forEachOrdered(j -> {
            if (charCountMap.containsKey(cArr[j])) {
                charCountMap.put(cArr[j], charCountMap.get(cArr[j]) + 1);
            } else
                charCountMap.put(cArr[j], 1);
        });

        System.out.println(charCountMap);

        for(int i = 0 ; i < cArr.length; i ++){
            if(charCountMap.get(cArr[i]) == 1){
                return cArr[i];
            }
        }
       /* for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }*/

       throw new InvalidParameterException();
    }
}
