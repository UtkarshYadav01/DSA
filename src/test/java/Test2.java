import java.util.List;
import java.util.stream.Collectors;

public class Test2
{
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 0, -3, 0, 5, -2, 0, 8, 0, -4);
        List<Integer> nonzero = number.stream()
                .filter(n -> n != 0)
                .collect(Collectors.toList());
        long zcount = number.stream()
                .filter(n -> n == 0)
                .count();
        for (int i = 0; i < zcount; i++) {
            nonzero.add(0);
        }
        System.out.println(nonzero);
        //Stream<Integer> integerStream = number.stream();
        //integerStream
        //long count = integerStream.count();
        //integerStream.forEach(System.out::println);
        //System.out.println(count);
    }
}
