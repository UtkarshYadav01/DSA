import java.util.*;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        List<String> items  = Arrays.asList(
                "Apple", "Banana", "Mango",
                "Apple", "Orange", "Banana",
                "Grapes", "Mango", "Apple",
                "Pineapple"
        );
        Map<String, Long> wordCounts = items.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(wordCounts);
    }
}
