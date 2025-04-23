package StreamAPI;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QCountCharactersFromString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";
        Map<Character, Long> collect = a.toLowerCase().chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        System.out.println(collect);

        Map<Character, Long> collect2 = b.toLowerCase().chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c->c,
                        Collectors.counting()));

        System.out.println(collect2);

        System.out.println(collect2.equals(collect));

    }
}
