package StreamAPI;

import java.util.Arrays;

public class Q19FilterPalindromeWords {
    public static void main(String[] args) {
        String[] str = { "abc", "ada", "kiran", "level", "apple", "narendra", "madam" };
        Arrays.stream(str)
                .filter(s->s.equals(new StringBuilder(s).reverse().toString()))
                .forEach(System.out::println);

        Arrays.stream(str)
                .filter(s->s.contentEquals(new StringBuilder(s).reverse()))
                .forEach(System.out::println);

    }
}
