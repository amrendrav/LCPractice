package self.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SumOfAllElements {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(25);
        integerList.add(35);
        integerList.add(45);
        integerList.add(55);
        integerList.add(65);
        integerList.add(51);

        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        integerList.sort(Integer::compareTo);
        final int sum = integerList.stream().mapToInt(s-> s.intValue()).sum();
        //integerList.parallelStream().
        System.out.println(integerList);
        System.out.println(sum);
    }

}
