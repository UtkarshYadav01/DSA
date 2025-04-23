package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q8FindNumStartingWith1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 7, 4, 13, 9, 14, 11, 2, 19, 0);
        nums.stream()
                .map(String::valueOf)
                .filter(n -> n.startsWith("1")).forEach(System.out::println);
        System.out.println();
        nums.stream()
                .map(n -> n.toString())
                .filter(n -> n.startsWith("1"))
                .forEach(System.out::println);
    }
}
