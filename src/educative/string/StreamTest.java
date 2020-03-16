package educative.string;


import java.util.Arrays;

public class StreamTest {

        public static void main(String[] args) {
            /* no terminal operation on stream */
            System.out.println("Stream without terminal operation");

            Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
                System.out.println("doubling " + i);
                return i * 2;
            });
            /* with terminal operation on stream */
            System.out.println("Stream with terminal operation");
            Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
                System.out.println("doubling " + i);
                return i * 2;
            }).sum();
        }
    }

