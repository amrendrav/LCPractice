package icake;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {

    public static boolean hasPalindromePermutation(String theString) {

        // check if any permutation of the input is a palindrome
        Set<Character> unpairedCharacters = new HashSet<>();

        for (char c : theString.toCharArray())
            if (unpairedCharacters.contains(c)) unpairedCharacters.remove(c);
            else unpairedCharacters.add(c);

        return unpairedCharacters.size() <= 1 ;
    }

}
