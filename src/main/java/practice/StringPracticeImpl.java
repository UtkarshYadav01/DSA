package practice;

import java.util.*;

public class StringPracticeImpl implements StringPractice {

    public static void main(String[] args) {
        StringPracticeImpl practice = new StringPracticeImpl();

        String str = "Hello World!";
        String str2 = "dlroW olleH";

        System.out.println("Is Palindrome: " + practice.isPalindrome(str));
        System.out.println("Vowels, Consonants, Spaces: " + Arrays.toString(practice.countVowelsConsonantsSpaces(str)));
        System.out.println("ASCII of 'A': " + practice.getAsciiValue('A'));
        System.out.println("Without Vowels: " + practice.removeVowels(str));
        System.out.println("Without Spaces: " + practice.removeSpaces(str));
        System.out.println("Alphabets Only: " + practice.retainAlphabetsOnly(str));
        System.out.println("Reversed: " + practice.reverseString(str));
        System.out.println("Without Brackets: " + practice.removeBrackets("(a+b)*(c-d)"));
        System.out.println("Sum of Numbers in String: " + practice.sumOfNumbersInString("abc123def45"));
        System.out.println("Capitalize First and Last: " + practice.capitalizeFirstAndLast("hello world java"));
        System.out.println("Character Frequency: " + practice.charFrequency(str));
        System.out.println("Non-Repeating Characters: " + practice.nonRepeatingCharacters("swiss"));
        System.out.println("Are Anagrams: " + practice.areAnagrams("listen", "silent"));
        System.out.println("Common Subsequences: " + practice.countCommonSubsequences("abc", "abc"));
        System.out.println("Wildcard Match (a*b vs aab): " + practice.wildcardMatch("aab", "a*b"));
        System.out.println("Max Occurring Character: " + practice.maxOccurringChar("sample string sample"));
        System.out.println("Without Duplicates: " + practice.removeDuplicates("programming"));
        System.out.println("Duplicates: " + practice.findDuplicates("programming"));
    }

    @Override
    public boolean isPalindrome(String str) {
        // TODO
        return false;
    }

    @Override
    public int[] countVowelsConsonantsSpaces(String str) {
        // TODO
        return new int[3]; // [vowels, consonants, spaces]
    }

    @Override
    public int getAsciiValue(char ch) {
        // TODO
        return 0;
    }

    @Override
    public String removeVowels(String str) {
        // TODO
        return "";
    }

    @Override
    public String removeSpaces(String str) {
        // TODO
        return "";
    }

    @Override
    public String retainAlphabetsOnly(String str) {
        // TODO
        return "";
    }

    @Override
    public String reverseString(String str) {
        // TODO
        return "";
    }

    @Override
    public String removeBrackets(String str) {
        // TODO
        return "";
    }

    @Override
    public int sumOfNumbersInString(String str) {
        // TODO
        return 0;
    }

    @Override
    public String capitalizeFirstAndLast(String str) {
        // TODO
        return "";
    }

    @Override
    public Map<Character, Integer> charFrequency(String str) {
        // TODO
        return new HashMap<>();
    }

    @Override
    public List<Character> nonRepeatingCharacters(String str) {
        // TODO
        return new ArrayList<>();
    }

    @Override
    public boolean areAnagrams(String str1, String str2) {
        // TODO
        return false;
    }

    @Override
    public int countCommonSubsequences(String str1, String str2) {
        // TODO
        return 0;
    }

    @Override
    public boolean wildcardMatch(String str, String pattern) {
        // TODO
        return false;
    }

    @Override
    public char maxOccurringChar(String str) {
        // TODO
        return '\0';
    }

    @Override
    public String removeDuplicates(String str) {
        // TODO
        return "";
    }

    @Override
    public Set<Character> findDuplicates(String str) {
        // TODO
        return new HashSet<>();
    }
}
