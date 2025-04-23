package HR;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "He is a very very good boy, isn't he?";
        scan.close();

        // Use regular expression to split by non-letter characters
        String[] tokens = s.trim().split("[^A-Za-z]+");

        // Handle the case where input is empty or only has delimiters
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
