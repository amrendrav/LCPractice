package educative.arrays;

import java.util.Arrays;

public class BinarySearch_Recursive {

    public static void main(String[] args) {
        //int[] iArr = {19, 2, 5, 8, 7, 4};
        int[] iArr = {4,5,6,7,0,1,2};
        System.out.println(findIndexOfGivenNumber(iArr, 0, 0, iArr.length-1));
    }

    private static int findIndexOfGivenNumber(int[] iArr, int key, int startIndex, int endIndex) {
        Arrays.sort(iArr);
        if (startIndex > endIndex) return -1;
        int mid = startIndex + (endIndex - startIndex) / 2;
        if (key == iArr[mid]) return mid;
        if (key <= iArr[mid]) {
            endIndex = mid - 1;
            return findIndexOfGivenNumber(iArr, key, startIndex, endIndex);
        } else {
            startIndex = mid + 1;
            return findIndexOfGivenNumber(iArr, key, startIndex, endIndex);
        }
    }
}
