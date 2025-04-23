package HR;

import java.util.Scanner;

public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            String result = Compile(pattern)? "Valid":"Invalid";
            System.out.println(result);
            testCases--;
        }

    }
    public static boolean Compile(String pattern ){

        return false;
    }
}
