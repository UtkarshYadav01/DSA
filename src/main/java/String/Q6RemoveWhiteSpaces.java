package String;

public class Q6RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s = " String with White spaces ";

        System.out.println(s.trim());
        System.out.println(s.replaceAll("[^A-Za-z0-9]", ""));
        System.out.println(s.replaceAll("\\s", ""));//white space=\\s

    }
}
