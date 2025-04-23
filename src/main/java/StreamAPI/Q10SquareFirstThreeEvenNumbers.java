package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q10SquareFirstThreeEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        nums.stream()
                .filter(n->n%2==0)
                .limit(3)
                .map(n->Math.pow(n,2))
                .forEach(System.out::println);

        nums.stream()
                .filter(n->n%2==0)
                .limit(3)
                .map(n->n*n)
                .forEach(System.out::println);
    }
}
