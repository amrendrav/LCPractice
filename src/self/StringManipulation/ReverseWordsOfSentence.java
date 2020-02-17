package self.StringManipulation;

public class ReverseWordsOfSentence {

    public static void main(String[] args) {
        System.out.println(reverseSentenceWords("Welcome to Java World"));
    }

    /**
     * Reverse sequence of words for the given sentence
     * @param inputString
     */
    private static String reverseSentenceWords(String inputString){

        reverseString(inputString);

        return null;
    }

    /**
     * Reverses Characters sequence of a String
     * @param str
     */
    private static String reverseString(String str){
        char[] inputCharArray = str.toCharArray(), outPutCharArray = new char[str.length()];
        int end = str.length()-1, start = 0;

        for(int i =0; i <end; i++ ){
            int temp = inputCharArray[i];


        }
    return null;
    }

}
