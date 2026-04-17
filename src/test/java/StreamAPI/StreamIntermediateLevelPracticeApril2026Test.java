package StreamAPI;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class StreamIntermediateLevelPracticeApril2026Test {

    StreamIntermediateLevelPracticeApril2026 test = new StreamIntermediateLevelPracticeApril2026();

    List<StreamIntermediateLevelPracticeApril2026.Employee> employees = List.of(
            new StreamIntermediateLevelPracticeApril2026.Employee("Candace", "HR", 60000),
            new StreamIntermediateLevelPracticeApril2026.Employee("Bob", "IT", 90000),
            new StreamIntermediateLevelPracticeApril2026.Employee("David", "IT", 110000),
            new StreamIntermediateLevelPracticeApril2026.Employee("Sam", "IT", 9000),
            new StreamIntermediateLevelPracticeApril2026.Employee("Alice", "HR", 70000),
            new StreamIntermediateLevelPracticeApril2026.Employee("Eric", "Sales", 50000));

    List<StreamIntermediateLevelPracticeApril2026.Person> persons = List.of(
            new StreamIntermediateLevelPracticeApril2026.Person("Alice", 25),
            new StreamIntermediateLevelPracticeApril2026.Person("Bob", 30),
            new StreamIntermediateLevelPracticeApril2026.Person("Charlie", 28),
            new StreamIntermediateLevelPracticeApril2026.Person("David", 35));

    @Test
    @DisplayName("Q1.Sort List of Employees By Salary")
    void question1() {
        System.out.println(test.question1(employees));
    }

    @Test
    @DisplayName("Q1_1.Sort List of Employees By Salary in reverse order")
    void question1_1() {
        System.out.println(test.question1_1(employees));
    }


    @Test
    @DisplayName("Q2.Calculate the avg age of a list of person Objects Using java Streams")
    void question2() {
        System.out.println(test.question2(persons));
    }


    @Test
    @DisplayName("Q3.Partition numbers in Even and Odd List")
    void question3() {
        System.out.println(test.question3(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }


    @Test
    @DisplayName("Q4.Group a list of words by their length using streams")
    void question4() {
        System.out.println(test.question4(Arrays.asList("Apple", "Banana", "Orange", "Pineapple", "Watermelon")));
    }


    @Test
    @DisplayName("Q5.Count the occurrence of each element in a list")
    void question5() {
        System.out.println(test.question5(Arrays.asList("Apple", "Banana", "Orange", "Orange", "Orange", "Orange", "Pineapple", "Watermelon", "Apple", "Banana")));
    }


    @Test
    @DisplayName("Q6.Group employees by department and calculate average salary")
    void question6() {
        System.out.println(test.question6(employees));
    }

    @Test
    @DisplayName("Q7.Find the highest-paid employee in each department")
    void question11() {
        System.out.println(test.question7(employees));
    }

    @Test
    @DisplayName("Q8.Find All Departments with More than 2 Employees")
    void question7() {
        System.out.println(test.question8(employees));
    }

    @Test
    @DisplayName("Q9.Find department with the highest average salary")
    void question8() {
        System.out.println(test.question9(employees));
    }

    @Test
    @DisplayName("Q10.Find most frequent character in string")
    void question9() {
        System.out.println(test.question10("employees"));
    }

    @Test
    @DisplayName("Q11.Find First non-repeating character in string")
    void question10() {
        System.out.println(test.question11("employees"));
    }

}