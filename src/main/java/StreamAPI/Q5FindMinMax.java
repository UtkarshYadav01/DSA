package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q5FindMinMax {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 1, 6, 3, 4, 5);
        int min = myList.stream().mapToInt(Integer::intValue).min().getAsInt();
        int max = myList.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(min);
        System.out.println(max);
    }
}
