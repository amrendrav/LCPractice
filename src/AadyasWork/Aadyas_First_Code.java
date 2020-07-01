package AadyasWork;

import java.util.Scanner;

public class Aadyas_First_Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("let's add apples");
        System.out.print("Enter First apple count");
        int a = scanner.nextInt();

        System.out.print("Enter Second apple count");
        int b = scanner.nextInt();

        System.out.print("Result is : "+ (a + b));
        int result = a ;

        scanner.close();
    }
}
