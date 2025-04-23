package StreamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q17MergeTwoArraysInSortedSingleList {
    public static void main(String[] args) {
        int[] array1 = { 1, 3, 32, 5, 7 };
        int[] array2 = { 2, 4, 6, 62, 8 };

        IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .forEach(System.out::println);
    }
}
