import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<String>l1=new ArrayList<String>();
        l1.add("Utkarsh");
        l1.add("Ajay");
        l1.add("Bob");
        l1.add("Tom");
        l1.add("John");
        Stream<String> stream = l1.stream().filter(name -> name == "tom");
        System.out.println(stream);
    }
}
