package StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Q15CountWordFrequency {
    public static void main(String[] args) {
        String s = "This is Java language and Java is versatile language language";
        Map<String, Long> collect = Arrays
                .stream(s.split(" "))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        System.out.println(collect);
    }
}
