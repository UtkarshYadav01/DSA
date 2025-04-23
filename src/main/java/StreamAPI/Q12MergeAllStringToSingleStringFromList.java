package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q12MergeAllStringToSingleStringFromList {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Guava", "Cherry", "Coconut", "Berry");

        String collected = fruits.stream()
                .collect(Collectors.joining(","));
        System.out.println(collected);
    }
}
