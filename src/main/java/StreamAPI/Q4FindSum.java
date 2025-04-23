package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q4FindSum {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 1, 6, 3, 4, 5);
        int sum = myList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
