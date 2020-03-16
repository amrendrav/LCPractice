package walmart.onsite.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {
        //print last statement
        Stream<Integer> intStream = Stream.of(1,2,3,7,8,9,10);
        //Stream<Integer> intStream = Stream.of();

        //System.out.println(intStream.reduce((a,b) -> b).orElse(99));
        System.out.println(intStream.reduce((a,b) -> b).hashCode());
        //System.out.println(intStream.reduce((a,b) -> b).hashCode());


        List<String> stringList = Stream.of("i", "aM", "AMRxdsENDRA")
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        String[] sArr = {"i", "aM", "AMRxdsENDRA"};

        List<String> distChar = Arrays.stream(sArr)
                                    .map(s -> s.split(""))
                                    .flatMap(Arrays::stream).distinct()
                                    .collect(Collectors.toList());

        List<Character> charList = stringList. get(2).chars().mapToObj(obj -> (char) obj).collect(Collectors.toList());
    }
}
