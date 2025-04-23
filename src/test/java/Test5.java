import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Utkarsh");
        list.add("Amar");
        list.add("Aman");
        list.add("Amazon");
        list.add("Amazon");
        list.add("Amazon");

        System.out.println(Collections.frequency(list,"Amazon"));
        System.out.println(Arrays.asList(1,23,4));
        Comparator<Object> objectComparator = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
    }
}
