package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q22SortEmployeeByNameThenID {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(123, "Narendra Sahoo"),
                new Employee(456, "Abhaya Parida"),
                new Employee(156, "Abhaya Parida"),
                new Employee(256, "Abhaya Parida"),
                new Employee(356, "Abhaya Parida"),
                new Employee(876, "Dillip Singh"));

        list.stream()
                .sorted(Comparator.comparing(Employee::getName,Comparator.reverseOrder()).thenComparing(Employee::getId))
                .forEach(System.out::println);
    }
}
