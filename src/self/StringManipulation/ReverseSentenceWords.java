package self.StringManipulation;

public class ReverseSentenceWords {

    final static String toBeReversed = "My Name is Anthony Gonjalvis";

    public static void main(String[] args) {
        System.out.println(reverseWordsOFSentence(toBeReversed));
    }

    private static String reverseWordsOFSentence(String toBeReversed){
        String reversedString = new StringBuilder(toBeReversed).reverse().toString();
        String[] sarray = reversedString.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sarray.length ; i++){
            sb.append(reverseArray(sarray[i].toCharArray()));
        }
        return sb.toString();
    }

    private static char[] reverseArray(char[] inputArray){
        //System.out.println("Input Array : " + inputArray);
        for (int i = 0; i < inputArray.length/2; i++) {
            char temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 -i];
            inputArray[inputArray.length-1 -i] = temp;
        }
        System.out.println("Output Array : " + inputArray);
        return inputArray;
    }

}
