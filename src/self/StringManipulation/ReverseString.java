package self.StringManipulation;

public class ReverseString {

    public static void main(String[] args) {
        final String inputString = "AMRENDRA VIMAL";
        //Using StringBuffer
        final String reverseString = new StringBuffer(inputString).reverse().toString();
        System.out.println(inputString.substring(1));
        System.out.println(reverseString);
        System.out.println(reverseString(inputString));
    }

    private static String reverseString(final String inputString){
        //To handle when string is just one char
        if(inputString.length() < 2) return inputString;

        return reverseString(inputString.substring(1)) + inputString.charAt(0);
    }
}
