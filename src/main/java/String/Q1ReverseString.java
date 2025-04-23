package String;

public class Q1ReverseString {

    public static void main(String[] args) {
        String s= "Java";
        String reversed = reverseWithStr(s);
        System.out.println(reversed);
        String reversed2 = reverseWithStrBuff("gogo");
        System.out.println(reversed2);
        String reversed3 = reverseWithStrBuff("charAt");
        System.out.println(reversed3);
    }

    private static String reverseWithStr(String s) {
        String revString = "";
        char[] charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            revString +=charArray[i];
        }
        return revString;
    }

    private static String reverseWithStrBuff(String s) {
        StringBuffer revString = new StringBuffer();
        char[] charArray = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            revString.append(charArray[i]);
        }
        return revString.toString();
    }
    private static String reverseWithCharAt(String s) {
        StringBuilder revString = new StringBuilder();
        String str="";
        for (int i = s.length() - 1; i >= 0; i--) {
            revString.append(s.charAt(i));
            str+=s.charAt(i);
        }
        return //revString.toString();
         str;
    }
}
