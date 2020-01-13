package self.StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        final String inputString = "Indiana";
        findDuplicateChars1(inputString);
        findDuplicateChars2(inputString);
    }

    /**
     * Using Hash Map -> O(n)
     * @param inputString
     */
    public static void findDuplicateChars1(String inputString){
        char[] charArray = inputString.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();
        for (Character ch : charArray){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            }else{
                charMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet){
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

    /**
     * Using plain for loop -> O(n^2)
     */
    public static void findDuplicateChars2(String inputString){

        char d = 0;
        int count = 0;
        for (int i = 0; i < inputString.length(); i++)
        {
            for (int j = i+1; j < inputString.length(); j++)
            {
                if (inputString.charAt(i)==inputString.charAt(j))
                {
                    if(d!=inputString.charAt(i))
                    {
                        count++;
                        d = inputString.charAt(i);
                        System.out.println("Duplicate Character is "+d);
                        break;
                    }
                }
            }
        }
        System.out.println("Number of duplicate character is "+count);
    }
}
