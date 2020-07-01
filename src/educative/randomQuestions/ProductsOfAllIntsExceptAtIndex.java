package educative.randomQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductsOfAllIntsExceptAtIndex {

    public static void main(String[] args) {

        Integer[] iArr = {1, 7, 3, 4};
        Arrays.stream(getProductsOfAllIntsExceptAtIndex(iArr)).forEach(obj -> System.out.println(obj));
    }

    private static int[] getProductsOfAllIntsExceptAtIndex(Integer[] iArr) {

      int[] productOfAllExSameIndex = new int[iArr.length];
      int initProd = 1;
      //find product of all integers before the numvbner at index
        for (int i = 0; i < iArr.length ; i++) {
            //DO reverse of what we did also additionally while doing final storage
            // do an additional multiplication fo existing number with new number
            productOfAllExSameIndex[i] = initProd;

            initProd *=  iArr[i];
        }

        initProd = 1;
        //find product of all integers after the current index
        for (int i = iArr.length-1; i >=0 ; i--) {
            productOfAllExSameIndex[i] *= initProd;
            initProd *= iArr[i];
        }

        return productOfAllExSameIndex;
    }
}
