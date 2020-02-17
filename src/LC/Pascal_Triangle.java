package LC;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Pascal_Triangle {
    public static void main(String[] args) {
        generatePascal_triangle(5).stream().forEach(obj -> {
                    System.out.println();
                    obj.stream().forEach(a -> {
                        System.out.print(a);
                    });
                }
                );
    }


    private static List<List<Integer>> generatePascal_triangle(int size){

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for(int i = 1 ; i < size; i++){
            List<Integer> prevRow = result.get(i- 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);
            for (int j = 1; j <i ; j++)
                currentRow.add(prevRow.get(j-1)+ prevRow.get(j));

            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }
}
