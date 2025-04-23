package String;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q2ReverseStringWithStreamAPI {

    public static void main(String[] args) {
        String s = "Java";
        String reversed = reverseWithStream2(s);
        System.out.println(reversed);
    }

    private static String reverseWithStream(String s) {
        return Stream
                .of(s)
                .map(String -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(s));
    }

    private static String reverseWithStream2(String s) {
        return s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce((s1, s2) -> s2+s1)
                .orElse("");
    }

}
