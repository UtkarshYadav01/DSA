import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<String>();
        l1.add("Utkarsh");
        l1.add("Ajay");
        l1.add("Bob");
        l1.add("Tom");
        l1.add("John");
        l1.stream();

        System.out.println(l1.stream().filter( x -> x=="Tom").count());

        ArrayList<String> words = new ArrayList<>(List.of(
                "apple", "banana", "cherry", "date", "apple",
                "fig", "grape", "apple", "banana", "kiwi"
        ));
        Map<String, Long> collect = words.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect);
    }
}
