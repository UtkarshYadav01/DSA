package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Q24FindAllEmployeesForADepartment {
    public static void main(String[] args) {
        List<EmployeeWithDepartment> list = Arrays.asList(new EmployeeWithDepartment(123, "Narendra Sahoo", "Dev"),
                new EmployeeWithDepartment(456, "Abhaya Parida", "AI"),
                new EmployeeWithDepartment(156, "Abhaya Parida", "AI"),
                new EmployeeWithDepartment(256, "Abhaya Parida", "Testing"),
                new EmployeeWithDepartment(356, "Abhaya Parida", "BPO"),
                new EmployeeWithDepartment(876, "Dillip Singh", "Dev"));

        list.stream()
                .filter(e->e.getDepartment()=="AI").forEach(System.out::println);

        System.out.println();

        list.stream()
                .filter(e->e.getDepartment().equals("AI")).forEach(System.out::println);

    }
}
