package StreamAPI.practice.code_periodYTset;

import java.util.Arrays;
import java.util.Comparator;

//01 Given a sentence, find the word that has the highest length
public class Q1HighestLength {

    static void main() {
        String s = "I am learning Streams API in Java";

        var a= Arrays.stream(s.split(" ")).min(Comparator.reverseOrder());
        System.out.println(a);

    }
}
