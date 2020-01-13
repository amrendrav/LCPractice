package educative.arrays;

import java.util.Arrays;

public class BinarySearch_Iterative {

    public static void main(String[] args) {
        int[] iArr = {19, 2, 5, 8, 7, 4};
        System.out.println(findBinarySearchIndex(iArr, 7));
    }

    private static int findBinarySearchIndex(int[] arr, int key){
        //sort the input array;
        Arrays.sort(arr);
        return findIndexOfKey(arr, key, 0, arr.length-1);
    }

    private static int findIndexOfKey(int[] arr, int key, int startIndex, int endIndex){
        //loop till startIndex is less than or equal to endIndex
        while(startIndex <= endIndex){
            int mid = startIndex + ((endIndex - startIndex)/2);
            if(key == arr[mid]) return mid;
            if(key <= arr[mid]){
                endIndex = mid - 1;
            }else{
                startIndex = mid + 1;
            }
        }
        return -1;
    }
}
