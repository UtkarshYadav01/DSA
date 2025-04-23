package String;

import java.util.Arrays;

public class Q5ReverseWords {
    public static void main(String[] args) {
        String s = "God is Great";
        String reversed = ReverseWords(s);
        System.out.println(reversed);

        //2ndway
        String s3 = Arrays.stream(s.split(" ")).reduce((s1, s2) -> s2 + " " + s1).orElse(" ");
        System.out.println("2nd way: " + s3);
    }

    //1St Way
    private static String ReverseWords(String s) {

        StringBuilder rev = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            //System.out.print(words[i]+" ");
            rev.append(words[i]).append(" ");
        }

        return rev.toString();

    }
}
