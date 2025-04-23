import java.util.Arrays;

public class PrintArrayValues {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        String[] split = s.split(" ");

        String ss = Arrays.toString(split);
        System.out.println(ss);
    }
}
