package self.StringManipulation.anagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramIndexes {

    public List<Integer> findAnagrams(String largeString, String smallString) {
        int ll = largeString.length(), sl = smallString.length();
        if (ll < sl) return new ArrayList();

        Map<Character, Integer> lSCharCount = new HashMap();
        Map<Character, Integer> sSCharCount = new HashMap();
        // build reference hash-map using string p
        for (char ch : smallString.toCharArray()) {
            if (lSCharCount.containsKey(ch)) {
                lSCharCount.put(ch, lSCharCount.get(ch) + 1);
            }
            else {
                lSCharCount.put(ch, 1);
            }
        }

        List<Integer> output = new ArrayList();
        // sliding window on the string s
        for (int i = 0; i < ll; ++i) {
            // add one more letter
            // on the right side of the window
            char ch = largeString.charAt(i);
            if (sSCharCount.containsKey(ch)) {
                sSCharCount.put(ch, sSCharCount.get(ch) + 1);
            }
            else {
                sSCharCount.put(ch, 1);
            }
            // remove one letter
            // from the left side of the window
            if (i >= sl) {
                ch = largeString.charAt(i - sl);
                if (sSCharCount.get(ch) == 1) {
                    sSCharCount.remove(ch);
                }
                else {
                    sSCharCount.put(ch, sSCharCount.get(ch) - 1);
                }
            }
            // compare hashmap in the sliding window
            // with the reference hashmap
            if (lSCharCount.equals(sSCharCount)) {
                output.add(i - sl + 1);
            }
        }
        return output;
    }
}
