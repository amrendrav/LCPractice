package self.StringManipulation;

public class ReverseWordsOfSentence {

   /* public static void main(String[] args) {
        char[] inputCHarArray = "Welcome to Java World".toCharArray();
        //reverseSentenceWords(inputCHarArray);
        reverse_words(inputCHarArray);
        System.out.println(inputCHarArray);
    }

    *//**
     * Reverse sequence of words for the given sentence
     * @param inputCharArray
     *          Sentence whose words has to be reversed.
     *//*
    private static void reverseSentenceWords(char[] inputCharArray){

        if(inputCharArray == null || inputCharArray.length == 0) return ;
        int len = inputCharArray.length;

        reverseString(inputCharArray, 0, len-2);

        int start = 0, end;
        *//*while(true){
            while(inputCharArray[start] == ' '){
                ++ start;
            }

            while(inputCharArray[start] == '\0'){
                break;
            }

            end = start + 1;
            while( (end < inputCharArray.length -1) && inputCharArray[end] != '\0' && inputCharArray[end] != ' '){
               ++ end;
             }

            reverseString(inputCharArray, start, end -1);

            start = end;
        }*//*

        while (true) {
            // find the  start index of a word while skipping spaces.
            while (inputCharArray[start] == ' ') {
                ++start;
            }

            if (inputCharArray[start] == '\0') {
                break;
            }

            // find the end index of the word.
            end = start+1;
            while (inputCharArray[end] != '\0' && inputCharArray[end] != ' ') {
                ++end;
            }

            // let's reverse the word in-place.
            reverseString (inputCharArray, start, end-1);

            start = end;
        }
    }

    *//**
     * Reverses Characters sequence of a String
     * @param start
     *          beginning of the string
     * @param inputCharArray
     *          Input String as Char array
     * @param end
     *          end of the string
     *//*
    private static void reverseString(char[] inputCharArray, int start, int end){
        if (inputCharArray == null || inputCharArray.length < 2) {
            return;
        }
        while(start < end ){
            char temp = inputCharArray[start];
            inputCharArray[start] = inputCharArray[end];
            inputCharArray[end] = temp;
            start ++;
            end --;
        }
    }
*/


        // Null terminating strings are not used in java
        // however for this question assume you are passed a null terminated string
        public static void str_rev(char[] str, int start, int end) {
            if (str == null || str.length < 2) {
                return;
            }

            while (start < end) {

                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;

                start++;
                end--;
            }
        }

        public static void reverse_words (char[] sentence) {

            // Here sentence is a null-terminated string ending with char '\0'.

            if (sentence == null || sentence.length == 0) {
                return;
            }

            // To reverse all words in the string, we will first reverse
            // the string. Now all the words are in the desired location, but
            // in reverse order: "Hello World" -> "dlroW olleH".

            int len = sentence.length;
            str_rev(sentence, 0, len-2);

            // Now, let's iterate the sentence and reverse each word in place.
            // "dlroW olleH" -> "World Hello"

            int start = 0;
            int end;
            while (true) {
                // find the  start index of a word while skipping spaces.
                while (sentence[start] == ' ') {
                    ++start;
                }

                if (sentence[start] == '\0') {
                    break;
                }

                // find the end index of the word.
                end = start+1;
                while (sentence[end] != '\0' && sentence[end] != ' ') {
                    ++end;
                }

                // let's reverse the word in-place.
                str_rev (sentence, start, end-1);

                start = end;
            }
        }
        static void print(char[] s) {
            int i = 0;
            while (s[i] != '\0') {
                System.out.print(s[i]);
                ++i;
            }
            System.out.println();
        }
        static char[] getArray(String t) {
            char[] s = new char[t.length() + 1];
            int i = 0;
            for (;i < t.length(); ++i) {
                s[i] = t.charAt(i);
            }
            s[i] = '\0';
            return s;
        }

        public static void main(String[] args) {
            char[] s = getArray("Hello World!");
            print(s);
            reverse_words (s);
            print(s);

            s = getArray("Quick brown fox jumped over the lazy dog");
            print(s);
            reverse_words(s);
            print(s);
        }
    }

