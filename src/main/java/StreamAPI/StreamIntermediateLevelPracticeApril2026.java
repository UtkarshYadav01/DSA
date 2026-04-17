package StreamAPI;

import java.util.*;
import java.util.function.Function;
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
    }

    //Q7.Find the highest-paid employee in each department
    Map<String,Optional<Employee>> question7(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.maxBy(Comparator.comparing(Employee::salary))
                ));
    }

    //Q8.Find All Departments with More than 2 Employees
    String question8(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(e->e.getValue()>2)
                .findFirst()
                .get()
                .getKey();

        // String v= employees.stream()
        // .collect(Collectors.groupingBy(
        //     Employee::department,
        //     Collectors.counting()))
        //     .entrySet
        //     .stream()
        // .filter(e->e.getValue()>2)
        // .map(e->e.getKey())
        // .findFirst().get();

        /*employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment
                        , Collectors.counting()
                ))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();*/
    }

    //Q9.Find department with the highest average salary
    String question9(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.averagingDouble(Employee::salary)
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get();

        //Q3.Find department with the highest average salary
        // var v=employees.stream()
        // .collect(Collectors.groupingBy(
        //     Employee::department,
        //     Collectors.averagingDouble(Employee::salary)))
        //         .entrySet()
        //         .stream()
        //         .max(Comparator.comparing(e->e.getValue()))
        //         .orElseThrow();
        // .map(e->e.getKey());

        /*Map.Entry<String, Double> stringDoubleEntry = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();*/
    }

    //Q10.Find most frequent character in string
    Character question10(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow().getKey();

        //Q4.Find most frequent character in string
//        String str="gamesss";

         /*var v=
         str.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(
            c->c,Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .orElseThrow();*/
        /*var v=
        Arrays.stream(str.split(""))
        .collect(Collectors.groupingBy(
            c->c,Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue());*/

        /*String input = "banana";

      //  "banana" → ['b', 'a', 'n', 'a', 'n', 'a']

        Map.Entry<Character, Long> characterLongEntry = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(characterLongEntry);*/

    }

    //Q11.Find First non-repeating character in string
    Character question11(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c->c,
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream()
                .filter(e->(e.getValue()==1))
                .findFirst().orElseThrow().getKey();

        /*str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        c->c,
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .findFirst();*/

        /* String str = "swiss";

        Optional<Map.Entry<Character, Long>> first = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new
                        , Collectors.counting()
                )).entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst();*/


    }


}


