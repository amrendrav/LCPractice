package educative.arrays;

/*
Problem statement:
Given an array of integers and a window of size w, find the current maximum value in the window as the window slides through the entire array.
Consider the array provided below. Let’s try to find all maximums for a window size = 3.
Input Array: [10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67]
Ans: [10, 9, 23, 23, 34, 56, 67, 67, 67, -1, -2, 9, 10, 34, 67]
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class findMaxInSlidingWindow {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print("Array = ");
        System.out.println(Arrays.toString(array));
        System.out.println("Max = " + findMaxSlidingWindow(array, 3));
        int[] array2 = { 10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67 };
        System.out.println("Array = " + Arrays.toString(array2));
        System.out.println("Max = " + findMaxSlidingWindow(array2, 3));
    }

    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
        ArrayDeque<Integer> result = new ArrayDeque<>(); // ArrayDeque for storing values
        if(arr.length > 0) {
            Deque<Integer> list = new LinkedList<Integer>(); // creating a linked list
            if( arr.length < windowSize) // Invalid State
                return result;
            int startingIndex = 0;
            for(int i = startingIndex; i < windowSize; ++i) {
                // Removing last smallest element index
                while(!list.isEmpty() && arr[i] >= arr[list.peekLast()])
                    list.removeLast();
                // Adding newly picked element index
                list.addLast(i);
                startingIndex = i + 1; // Next starting index
            }
            for(int i = startingIndex; i < arr.length; ++i) {
                result.add(arr[list.peek()]);
                // Removing all the elements indexes which are not in the current window
                while((!list.isEmpty()) && list.peek() <= i-windowSize)
                    list.removeFirst();
                // Removing the smaller elements indexes which are not required
                while((!list.isEmpty()) && arr[i] >= arr[list.peekLast()])
                    list.removeLast();
                // Adding newly picked element index
                list.addLast(i);
            }
            // Adding the max number of the current window in the result
            result.add(arr[list.peek()]);
        }
        return result; // returning result
    }
}
