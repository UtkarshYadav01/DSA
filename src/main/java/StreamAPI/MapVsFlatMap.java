package StreamAPI;

import java.util.List;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> names = List.of("Utkarsh", "kiran", "Ravi");

        names.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        List<List<String>> lists = List.of(
                List.of("Ram", "kiran", "Ravi"),
                List.of("Shyam", "Mohan", "Raj"),
                List.of("John", "Sam", "Ajay"));

        System.out.println();
        lists.stream()
                .flatMap(s->s.stream())
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }
}
