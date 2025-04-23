package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q29SumOfSalaries {
    public static void main(String[] args) {
        List<Q28FindAvgSalariesInEachDepartment.EmployeeWithDepartmentAndSalary> list = Arrays.asList(new Q28FindAvgSalariesInEachDepartment.EmployeeWithDepartmentAndSalary(60000, "Narendra Sahoo", "Dev"),
                new Q28FindAvgSalariesInEachDepartment.EmployeeWithDepartmentAndSalary(50000, "Abhaya Parida", "AI"),
                new Q28FindAvgSalariesInEachDepartment.EmployeeWithDepartmentAndSalary(90000, "Abhaya Parida", "AI"),
                new Q28FindAvgSalariesInEachDepartment.EmployeeWithDepartmentAndSalary(70000, "Abhaya Parida", "Testing"),
                new Q28FindAvgSalariesInEachDepartment.EmployeeWithDepartmentAndSalary(21000, "Abhaya Parida", "BPO"),
                new Q28FindAvgSalariesInEachDepartment.EmployeeWithDepartmentAndSalary(33000, "Dillip Singh", "Dev"));

        Map<String, Double> collect = list.stream().collect(
                Collectors.groupingBy(Q28FindAvgSalariesInEachDepartment.EmployeeWithDepartmentAndSalary::getDepartment,
                        Collectors.summingDouble(Q28FindAvgSalariesInEachDepartment.EmployeeWithDepartmentAndSalary::getSalary)));
        System.out.println(collect);
    }
}
