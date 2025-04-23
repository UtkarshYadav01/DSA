package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q23GroupEmployeeByDepartment {
    public static void main(String[] args) {
        List<EmployeeWithDepartment> list = Arrays.asList(new EmployeeWithDepartment(123, "Narendra Sahoo", "Dev"),
                new EmployeeWithDepartment(456, "Abhaya Parida", "AI"),
                new EmployeeWithDepartment(156, "Abhaya Parida", "AI"),
                new EmployeeWithDepartment(256, "Abhaya Parida", "Testing"),
                new EmployeeWithDepartment(356, "Abhaya Parida", "BPO"),
                new EmployeeWithDepartment(876, "Dillip Singh", "Dev"));

        Map<String, List<EmployeeWithDepartment>> collect = list.stream()
                .collect(Collectors.groupingBy(EmployeeWithDepartment::getDepartment));

        System.out.println(collect);
    }
}

class EmployeeWithDepartment {

    private int id;
    private String Name;
    private String Department;

    public EmployeeWithDepartment(int id, String name, String department) {
        this.id = id;
        Name = name;
        Department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "EmployeeWithDepartment{" +
                " id=" + id +
                ", Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
