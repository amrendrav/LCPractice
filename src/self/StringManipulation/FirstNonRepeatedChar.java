package self.StringManipulation;

import java.util.*;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        final String stringToFindFirstNRChar = "Whatever";
        System.out.println(firstNonRepeatingChar_HashMap(stringToFindFirstNRChar));
        System.out.println(firstNonRepeatingChar_OnePass(stringToFindFirstNRChar));
    }

    private static char firstNonRepeatingChar_HashMap(final String inputString){
        final HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0 ; i < inputString.length(); i ++){
            if(countMap.containsKey(inputString.charAt(i))){
                countMap.put(inputString.charAt(i), countMap.get(inputString.charAt(i)) + 1);
            }else{
                countMap.put(inputString.charAt(i), 1);
            }
        }

        /*Doesn't works because HashMap is non-ordered
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()){
            if(entry.getValue() > 1)continue;
            else return entry.getKey();
        }*/

        for (int i = 0 ; i < inputString.length(); i ++){
            if(countMap.get(inputString.charAt(i)) > 1) continue;
            else return inputString.charAt(i);
        }

        throw new RuntimeException(String.format("Input string %s doesn't contain any unique chars", inputString));
    }

    public static char firstNonRepeatingChar_OnePass(String inputStr) {
        Set<Character> repeatingChar = new HashSet<>();
        List<Character> nonRepeatingChar = new ArrayList<>();
        for (int i = 0; i < inputStr.length() ; i++) {
            final char indexChar = inputStr.charAt(i);
            if(repeatingChar.contains(indexChar))
                continue;

            if(nonRepeatingChar.contains(indexChar)){
                repeatingChar.add(indexChar);
                nonRepeatingChar.remove((Character) indexChar);
            }else {
                nonRepeatingChar.add(indexChar);
            }
        }
        return nonRepeatingChar.get(0);
    }

}
