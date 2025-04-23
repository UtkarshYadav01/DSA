package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class Q3RemoveDuplicates {

    public static void main(String[] args) {
        String s = "Applesssss";//Aples

        //Approach-1: Using Java8
        System.out.print("Approach-1: ");
        s.chars().distinct().forEach(c -> System.out.print((char) c));
        s.chars().distinct().mapToObj(c -> String.valueOf((char) c))
                .reduce((s1, s2) -> s1 + s2).orElse("");
        System.out.println();

        //Approach-2: Using Set Collection
        StringBuilder builder = new StringBuilder();
        Set<Character> mySet = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mySet.add(ch);
        }
        for (Character c : mySet) {
            builder.append(c);
        }
        System.out.println("Approach-2: " + builder);

        //Approach-3: Using indexOf() Method
        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch, i + 1) == -1) {
                builder2.append(ch);
            }
        }
        System.out.println("Approach-3: " + builder2);

        //Approach-4: siting toCharArray()
        StringBuilder builder3 = new StringBuilder();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            boolean repeat = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repeat = true;
                }
            }
            if (!repeat){
                builder3.append(array[i]);
            }
        }
        System.out.println("Approach-4: " + builder3);
    }

}
