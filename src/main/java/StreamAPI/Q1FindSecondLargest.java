package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q1FindSecondLargest {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 1, 6, 3, 4, 5);
        myList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

        Integer i = myList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(i);
    }
}
