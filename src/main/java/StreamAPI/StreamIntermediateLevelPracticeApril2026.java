package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamIntermediateLevelPracticeApril2026 {

    record Employee(String name, String department, double salary) {
    }

    record Person(String name, int age) {
    }

    //Q1.Sort List of Employees By Salary
    List<Employee> question1(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::salary))
                .toList();

    }

    //Q1_1.Sort List of Employees By Salary in reverse order
    List<Employee> question1_1(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::salary).reversed())
                .toList();
    }

    //Q2.Calculate the avg age of a list of person Objects Using java Streams
    double question2(List<Person> list) {
        return list.stream()
                .mapToInt(Person::age)
                .average()
                .orElse(0.0);
    }

    //Q3.Partition numbers in Even and Odd List
    Map<Boolean, List<Integer>> question3(List<Integer> list) {
        list.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
        return list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

    }

    //Q4.Group a list of words by their length using streams
    Map<Integer, List<String>> question4(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    //Q5.Count the occurrence of each element in a list
    Map<String, Long> question5(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    }

    //Q6.Group employees by department and calculate average salary
    Map<String, Double> question6(List<Employee> list) {

        return list.stream()
                .collect(Collectors.groupingBy(Employee::department,
                        Collectors.averagingDouble(Employee::salary)));
//        return null;
    }


}


