package StreamAPI;

import java.util.Arrays;

public class Q14RemoveDuplicateWordsFromString {
    public static void main(String[] args) {
        String s = "This is Java language and Java is versatile language ";
        Arrays.stream(s.split(" "))
                .distinct()
                .forEach(System.out::println);
    }
}
