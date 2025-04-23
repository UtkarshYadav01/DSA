import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Utkarsh";
        String reversed = reverseWithStream(s);
        System.out.println(reversed);
    }

    private static String reverse(String s) {

        String temp="";
        for (int i = s.length()-1; i >= 0  ; i--) {
            temp+=s.charAt(i);
        }
        return temp;
        //return new StringBuilder(s).reverse().toString();
    }
    private static String reverseWithStream(String s) {

        return Stream
                .of(s)
                .map(n->new StringBuilder(s).reverse())
                .collect(Collectors.joining());
    }
}
