package StreamAPI;

import java.util.List;
import java.util.stream.Stream;

public class Q18ConcatTwoStringListAndRemoveDuplicates {
    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana", "orange", "pinaaple");
        List<String> list2 = List.of("banana", "kiwi", "grape", "guava", "apple");

        Stream.concat(list1.stream(),list2.stream()).distinct().forEach(System.out::println);
    }
}
