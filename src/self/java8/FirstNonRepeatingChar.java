package self.java8;

import java.util.LinkedHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Class to find first non repeating character using Java 8
 */
public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        findFirstNonRepeatingChar("who_and_what", System.out::println);
    }

    public static void findFirstNonRepeatingChar(String s, Consumer<Character> callback){
        s.chars()
                //First map all the chars to an Object
                .mapToObj(charObj -> Character.valueOf((char) charObj) )
                //then collect all the object to a linkedHashMap to maintain the order grouping them by each Char
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                //then filter the char which has count ==1
                .entrySet().stream()
                .filter(obj -> obj.getValue() == 1)
                //then map the key to get the char
                .map(obj -> obj.getKey())
                //then get the firstOne
                .findFirst()
                //and return it to callBack
                .map(character -> {
                    callback.accept(character);
                    return character;
                });
    }
}
