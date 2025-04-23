package String;

public class Q7SwapStringsWithoutExtraVariable {
    public static void main(String[] args) {
        String s1="Apple";
        String s2="Ball";

        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());

        System.out.print("s1="+s1);
        System.out.println("s2="+s2);
    }
}
