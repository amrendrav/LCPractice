package educative;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PreetyPrint {
    public void doAction(Queue q) {
        if (q.isEmpty()) return;

        Object first = q.remove();
        doAction(q);
        System.out.println(first.toString());
    }

    public static void main(String[] args) {
        LinkedList<String> starterList = new LinkedList<>(
                Arrays.asList("A", "B", "C", "D", "E"));

        PreetyPrint pp = new PreetyPrint();

        pp.doAction(starterList);
    }
}
