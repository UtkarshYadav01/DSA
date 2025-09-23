package HashMap;

import java.util.*;

public class BirlaSoftInterViewYT {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 7);
        Set<String> strings = map.keySet();
        Collection<Integer> values = map.values();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        //java8Iteration(map);
        //normalIteration(map);
        //interviewGuyDidThis(map);
        sortTheMapBasedOnValue(map);
    }

    private static void java8Iteration(HashMap<String, Integer> map) {
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    private static void normalIteration(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e);
            //System.out.println(e.getKey() + "=" + e.getValue());
        }
    }

    private static void interviewGuyDidThis(HashMap<String, Integer> map) {
        for (String s : map.keySet()) {
            System.out.println(s + "=" + map.get(s));
        }
    }

    private static void sortTheMapBasedOnValue(HashMap<String, Integer> map) {
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

}
