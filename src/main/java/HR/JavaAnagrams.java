package HR;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Map<Character, Long> collect = a.toLowerCase().chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()));

        Map<Character, Long> collect2 = b.toLowerCase().chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()));
        return collect2.equals(collect);
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
