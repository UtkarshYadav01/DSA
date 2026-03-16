package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2FindEven {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 1, 6, 3, 4, 5);
        List<Integer> newList = new ArrayList<>();
        //1st
        /*for (Integer i : myList) {
            if (i % 2 == 0) {
                newList.add(i);
            }
        }
        for (Integer i : newList) {
            System.out.print(i);
        }*/
        //2nd
        /*myList.forEach(i -> {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        });*/
        //with streams
        /*Stream<Integer> data = myList.stream();
        Stream<Integer> filteredData = data.filter(n -> n % 2 == 0);
        filteredData.forEach(System.out::print);*/

        //find even numbers
        myList
                .stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::print);
    }
}
