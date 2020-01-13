package self.StringManipulation;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {
        final String firstString = "double";
        final String anagram = "elbuod";
        System.out.println(checkIfAnagram1(firstString, anagram));
        System.out.println(checkIfAnagram2(firstString, anagram));
        System.out.println(checkIfAnagram3(firstString, anagram));
    }

    //Iterate through char - for loop
    private static boolean checkIfAnagram1(String firstString, String anagram) {
        if(firstString.length() != anagram.length()) return false;

        char[] charArray = firstString.toCharArray();
        for(int i = 0; i<charArray.length; i ++){
            int index = anagram.indexOf(charArray[i]);
            if(index != -1){
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            }else {
                return false;
            }
        }

        return anagram.isEmpty();
    }

    //Using sorting char array - sort both string(char array) and do equals comparison on both arrays
    private static boolean checkIfAnagram2(String firstString, String anagram){
        char[] firstStCharArr = firstString.toCharArray();
        char[] secondStCharArr = anagram.toCharArray();

        Arrays.sort(firstStCharArr);
        Arrays.sort(secondStCharArr);

        return Arrays.equals(firstStCharArr, secondStCharArr);
    }

    //Using String Builder - one char array and second StringBuilder - then iterate through char array and keep deleting char at index and eventually if SB is empty return true
    private static boolean checkIfAnagram3(String firstString, String secondString){

        final char[] carArr = firstString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(secondString);

        for(char c : carArr){
            final int index = stringBuilder.indexOf(""+c);
            if(index != -1){
                stringBuilder.deleteCharAt(index);
            }else{
                return false;
            }

        }
        return stringBuilder.length() == 0 ? true: false;
    }
}
