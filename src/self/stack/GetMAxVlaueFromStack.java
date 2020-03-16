package self.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Use the built-in Stack class to implement a new class MaxStack with a method
 * getMax() that returns the largest element in the stack. getMax() should not remove the item.
 */
public class GetMAxVlaueFromStack {

    public static void main(String as []){

        int[] iArr= {2,5,61,23,65,43,86,23};

        System.out.println(findMax(iArr));
    }

    private static int findMax(int[] iArr) {

        Deque<Integer> mainStack = new ArrayDeque<>();
        Deque<Integer> largestNumberStack = new ArrayDeque<>();

        for (int i = 0; i < iArr.length ; i++) {
            mainStack.push(iArr[i]);
            if(largestNumberStack.size() == 0 || largestNumberStack.peek() < iArr[i]){
                largestNumberStack.push(iArr[i]);
            }
        }

        return largestNumberStack.peek();
    }
}
