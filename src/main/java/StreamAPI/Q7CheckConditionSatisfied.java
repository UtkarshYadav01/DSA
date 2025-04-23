package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q7CheckConditionSatisfied {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 1, 6, 3, 4, 5, 4, 5, 3, 2, 1, 1, 1, 1);
        boolean b = myList.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println(b);
        boolean b2 = myList.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(b2);
    }
}
