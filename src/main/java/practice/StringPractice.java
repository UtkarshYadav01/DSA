package practice;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface StringPractice {

    boolean isPalindrome(String str);

    int[] countVowelsConsonantsSpaces(String str);

    int getAsciiValue(char ch);

    String removeVowels(String str);

    String removeSpaces(String str);

    String retainAlphabetsOnly(String str);

    String reverseString(String str);

    String removeBrackets(String str);

    int sumOfNumbersInString(String str);

    String capitalizeFirstAndLast(String str);

    Map<Character, Integer> charFrequency(String str);

    List<Character> nonRepeatingCharacters(String str);

    boolean areAnagrams(String str1, String str2);

    int countCommonSubsequences(String str1, String str2);

    boolean wildcardMatch(String str, String pattern);

    char maxOccurringChar(String str);

    String removeDuplicates(String str);

    Set<Character> findDuplicates(String str);
}
