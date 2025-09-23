package HashMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapConversionExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.putAll(hashMap);

        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>(hashMap);

        // Just print one to see
        System.out.println("TreeMap (sorted): " + treeMap);
    }
}
