package String;

import java.util.Arrays;

public class DemoString {
    public static void main(String[] args) {

        int[] in = {1,2,3,};
        System.out.println(in);
        System.out.println(Arrays.toString(in));

        char[] ch = {'j','a','v','a'};
        System.out.println(ch);

        String s = "Java String";
       // s.
        System.out.println(s);

        String[] sarr = {"car","cat","rat"};
        System.out.println(sarr);
        System.out.println(Arrays.toString(sarr));

        String s1 = new String(new char[]{'a', 'b','c','d','e'}, 1, 2);
        System.out.println(s1);
    }
}
