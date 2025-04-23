package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q11MakeStringListUpperCase {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Guava", "Cherry", "Coconut", "Berry");
        fruits.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }
}
