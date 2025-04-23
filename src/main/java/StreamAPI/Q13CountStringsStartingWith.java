package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q13CountStringsStartingWith {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Guava", "Cherry", "Coconut", "Berry");
        long c = fruits.stream()
                .filter(s -> s.startsWith("C")).count();
        System.out.println(c);
    }
}
