package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q6FindAvg {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 1, 6, 3, 4, 5);
        Double avg = myList.stream().mapToDouble(n->n).average().getAsDouble();
        System.out.println(avg);
    }
}
