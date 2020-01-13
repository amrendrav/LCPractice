package educative.arrays;
/*In the example below,​ you are given three integer arrays sorted in ascending order,
        and you have to find the smallest number that is common in all three arrays.*/
public class SmallestCommonNumber {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 8, 10, 14, 50};
        int[] arr2 = new int[]{2, 8, 8, 13, 50};
        int[] arr3 = new int[]{3, 8, 7, 12, 25, 30, 40};
        System.out.println(findSmallestCommonNumber(arr1, arr2, arr3));
    }

    private static int findSmallestCommonNumber(int[] arr1, int[] arr2, int[] arr3) {

        int i = 0, j = 0, k = 0;


        while( i < arr1.length && j < arr2.length && k < arr3.length){

            //breaking condition
            if(arr1[i] == arr2[j]
                && arr2[j] == arr3[k]){
                return arr1[i];
            }
            //Incrementer for the smallest value
            if(arr1[i] <= arr2[j] &&
                arr1[i] <= arr3[k]){
                i++;
            }
            else if(arr2[j] <= arr1[i] &&
                arr2[j] <= arr3[k]){
                j++;
            }
            else if(arr3[k] <= arr1[i] &&
                arr3[k] <= arr2[j]){
                k++;
            }

        }

        return -1;
    }
}
