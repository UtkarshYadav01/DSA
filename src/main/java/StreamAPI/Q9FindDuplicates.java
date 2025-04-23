package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q9FindDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 1, 6, 3, 4, 5,4,5,3,2,1,1,1,1);
        myList.stream()
                .filter(n-> Collections.frequency(myList,n)>1)
                .distinct()
                .forEach(System.out::println);

        /*myList.stream()
                .filter(n-> Collections.frequency(myList,n)>1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/
    }
}
