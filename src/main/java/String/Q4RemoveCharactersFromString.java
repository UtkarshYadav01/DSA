package String;

public class Q4RemoveCharactersFromString {
    public static void main(String[] args) {
        String s = "Utkarsh#@Ja$va";
        String s1 = s.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(s1);
    }
}
