package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q20SeperateEvenOdd {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 5, 6, 3, 4, 8, 9, 4, 3, 56, 67);
        Map<Boolean, List<Integer>> collect = myList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);
    }
}
