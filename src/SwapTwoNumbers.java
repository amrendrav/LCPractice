public class SwapTwoNumbers {

    public static void main(String[] args) {
        swapTwoNumbers(3, 5);
    }

    private static void swapTwoNumbers(int a, int b){

        System.out.print(String.format("Input a: %d, b: %d %n", a, b));

        a = a-b;
        b = a+b;
        a = b-a;

        System.out.print(String.format("Output a: %d, b: %d %n", a, b));

    }
}
