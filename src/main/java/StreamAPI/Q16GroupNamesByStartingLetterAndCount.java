package StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Q16GroupNamesByStartingLetterAndCount {
    public static void main(String[] args) {
        String[] names = { "Anand", "Bipin", "Rakesh", "Abhi", "Rohan", "Akash", "Ravi", "Sima" };
        Map<Character, Long> collect = Arrays.stream(names)
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));

        System.out.println(collect);
    }
}
