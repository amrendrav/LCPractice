package onlineTest.appleContractor.viaSIS;

public class GenerateString {

    public static void main(String[] args) {
        System.out.println(solution(20) );
    }

    public static String solution(int n) {
        // write your code in Java SE 8
        //return N%2 == 0 ? "a".repeat(N-1) + "v":"v".repeat(N);

        char arr[] = new char[n];

        for (int i = 0; i < n; i++)
            arr[i] = 'p';

        if (n % 2 == 0)
            arr[n - 1] = 'z';

        return new String(arr);
    }

}
