package educative.arrays;

/*Search for a given number in a sorted array that has been rotated by some arbitrary number.
Return -1 if the number does not exist. Assume that the array does not contain duplicates.*/

public class BinarySearch_Rotated {

    public static void main(String[] args) {
        int[] inArr = {6, 7, 1, 2, 3, 4, 5};
        System.out.println(findIndexInRotatedSortedArray(inArr, 3, 0, inArr.length-1));
    }

    private static int findIndexInRotatedSortedArray(int[] inArr, int key, int startIndex, int endIndex) {
        if(startIndex > endIndex) return -1;

        int mid = startIndex + (endIndex - startIndex)/2;
        //breakout condition
        if(key == inArr[mid]){
            return mid;
        }

        if(inArr[startIndex] <= inArr[mid] && key <= inArr[mid] && key >= inArr[startIndex]) {
            return findIndexInRotatedSortedArray(inArr, key, startIndex, mid - 1);
        }else if(inArr[mid] <= inArr[endIndex] && key >= inArr[mid] && key <= inArr[endIndex]){
            return findIndexInRotatedSortedArray(inArr, key, mid + 1, endIndex);
        } else if(inArr[endIndex] <= inArr[mid]){
            return findIndexInRotatedSortedArray(inArr, key, mid +1, endIndex);
        }else if(inArr[startIndex] >= inArr[mid]){
           return findIndexInRotatedSortedArray(inArr, key, startIndex, mid -1);
        }
        return -1;
    }

}
