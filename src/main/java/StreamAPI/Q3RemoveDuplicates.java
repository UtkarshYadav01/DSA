package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q3RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 1, 6, 3, 4, 5,4,56,3,2,1);
        myList.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
