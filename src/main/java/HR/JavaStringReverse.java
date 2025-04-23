package HR;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        // Create a StringBuilder from the input string
        StringBuilder org = new StringBuilder(A);

        // Reverse the StringBuilder
        StringBuilder rev = org.reverse();

        // Check if the original string is equal to the reversed string
        if (rev.toString().equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
