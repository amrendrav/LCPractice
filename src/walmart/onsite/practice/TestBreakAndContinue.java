package walmart.onsite.practice;

public class TestBreakAndContinue {

    public static void main(String[] args) {

        //For Continue Demo:
        //Scenario 1:
        out:
        for (int i = 1; i <= 3; i++) {
            System.out.println("i : " + +i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("j : " + +j);
                if (j == 2) {
                    // continue; this will skip second(j==2) iteration of inner for loop only
                    continue out; // this will skip current iteration of both for loops
                }
            }
        }
        //Scenario 2:
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                if (a == 2 && b == 2) {
                    continue;
                }
                System.out.println("a: " + a + ",  " + "b: " +  b);
            }
        }

        //For Break Demo:
        System.out.println("\n+++++++++ Break +++++++++");
        System.out.println("\nUsing break as goto, Scenario :1");
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println(" this third block");
                    if (t) break first;
                }
                System.out.println(" this second block");
            }
            System.out.println(" this first block");
        }
        System.out.println(" this main block");

        System.out.println("\nBreak Scenario 2:");
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                if (a == 2 && b == 2) {
                    break;
                }
                System.out.println(a + " " + b);
            }
        }

        System.out.println("\nBreak Scenario 3:");
        for (int i = 0; i < 100; i++) {
            System.out.println(+i);
            if (i == 10)
                break; // as the condition inside 'if' satisfies control comes out of 'for' loop.
        }
        System.out.println(" Loop breaks here");

        System.out.println("\nBreak Scenario 4:");
        int[] test = {0, 1, 2, 3, 4};
        for (int s : test) {
            if (s == 3) {
                break;
            }
            System.out.print(s);
            System.out.print("\n");
        }
        System.out.println("break statement execution");

    }
}
