package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q28FindAvgSalariesInEachDepartment {
    public static void main(String[] args) {
        List<EmployeeWithDepartmentAndSalary> list = Arrays.asList(new EmployeeWithDepartmentAndSalary(60000, "Narendra Sahoo", "Dev"),
                new EmployeeWithDepartmentAndSalary(50000, "Abhaya Parida", "AI"),
                new EmployeeWithDepartmentAndSalary(90000, "Abhaya Parida", "AI"),
                new EmployeeWithDepartmentAndSalary(70000, "Abhaya Parida", "Testing"),
                new EmployeeWithDepartmentAndSalary(21000, "Abhaya Parida", "BPO"),
                new EmployeeWithDepartmentAndSalary(33000, "Dillip Singh", "Dev"));

        Map<String, Double> collect = list.stream().collect(
                Collectors.groupingBy(EmployeeWithDepartmentAndSalary::getDepartment,
                        Collectors.averagingDouble(EmployeeWithDepartmentAndSalary::getSalary)));
        System.out.println(collect);
    }

    static class EmployeeWithDepartmentAndSalary {

        private int Salary;
        private String Name;
        private String Department;

        public EmployeeWithDepartmentAndSalary(int Salary, String name, String department) {
            this.Salary = Salary;
            Name = name;
            Department = department;
        }

        public int getSalary() {
            return Salary;
        }

        public void setSalary(int salary) {
            this.Salary = salary;
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
                    " Salary=" + Salary +
                    ", Name='" + Name + '\'' +
                    ", Department='" + Department + '\'' +
                    '}';
        }
    }
}
