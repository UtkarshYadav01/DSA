package String;

public class TerickyStringQuestions {
    public static void main(String[] args) {
        Test5();
    }

    static void Test1() {
        String s1 = "Java";
        String s2 = "Ja" + "va";
        System.out.println(s1 == s2);
    }

    static void Test2() {
        System.out.println();
        System.out.println("Hello" == new String("Hello"));
    }

    static void Test3() {
        System.out.println();
        System.out.println(10 + 20 + "30" + 40 + 50);//30304050
    }

    static void Test4() {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.equals(s2) && s1 == s2);
    }

    static void Test5() {
        String str = null;
        System.out.println(str instanceof String);
    }
}
