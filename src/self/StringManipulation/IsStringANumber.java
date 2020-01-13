package self.StringManipulation;

import java.util.regex.Pattern;

public class IsStringANumber {

    public static void main(String[] args) {
        System.out.println(isStringANumber("12345"));
    }

    private static boolean isStringANumber(String string){
        Pattern pattern = Pattern.compile(".*[0-9].*");
        return pattern.matcher(string).matches();
    }
}
