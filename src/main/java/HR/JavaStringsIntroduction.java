package HR;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // Sum of lengths
        System.out.println(A.length() + B.length());

        // Lexicographical comparison
        if (A.compareTo(B) > 0) {  // fixed comparison logic
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalizing first letters
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
                B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
