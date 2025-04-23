package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q21SortCustomObject {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(123, "Narendra Sahoo"),
                new Employee(456, "Abhaya Parida"),
                new Employee(876, "Dillip Singh"));

        list.stream()
                .sorted(Comparator.comparing(Employee::getId,Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}

class Employee {

    private int id;
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(int a, String name) {
        this.id = a;
        Name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}