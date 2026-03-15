package on;

public class May182025Practice {
    public static void main(String[] args) {
        String s = "Hello";
        String result = removeVowels(s);
        String result2 = removeVowels2(s);
        System.out.println(result2);
    }

    private static String removeVowels2(String s) {
        return s.replaceAll("[aeiou]","");
    }

    private static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
