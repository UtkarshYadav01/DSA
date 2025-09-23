package StreamAPI;

import java.util.HashMap;
import java.util.Map;

public class Q26SortMapByKeyOrValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Utkarsh Yadav", 25);
        map.put("Kirna Gupta", 21);
        map.put("Gopal Rajpal", 45);
        map.put("Hari", 65);
        map.put("Ruhi", 2);
        map.put("Manas", 44);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
       // System.out.println(map.entrySet());
    }
}
