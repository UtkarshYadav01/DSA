package StreamAPI.practice;

import java.util.*;

public class Java8PracticeSet {

    public static void main(String[] args) {
        Java8PracticeSet practice = new Java8PracticeSet();

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 30, 15);
        List<String> words = Arrays.asList("apple", "banana", "apple", "madam", "noon", "level");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "David", "Alice");
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", "F", 60000, Arrays.asList("Excel", "Communication")),
                new Employee("Bob", "IT", "M", 80000, Arrays.asList("Java", "Spring")),
                new Employee("Charlie", "IT", "M", 75000, Arrays.asList("Java", "React")),
                new Employee("Anna", "Sales", "F", 50000, Arrays.asList("Negotiation", "Excel")),
                new Employee("David", "IT", "M", 85000, Arrays.asList("Kotlin", "Java"))
        );

        System.out.println("1. Second Largest: " + practice.findSecondLargest(numbers));
        System.out.println("2. Even Numbers: " + practice.getEvenNumbers(numbers));
        System.out.println("3. Without Duplicates: " + practice.removeDuplicates(numbers));
        System.out.println("4. Sum: " + practice.sumOfList(numbers));
        System.out.println("5. Max: " + practice.findMax(numbers));
        System.out.println("6. Min: " + practice.findMin(numbers));
        System.out.println("7. All Even?: " + practice.areAllEven(numbers));
        System.out.println("8. Starting with 1: " + practice.numbersStartingWithOne(numbers));
        System.out.println("9. Duplicates: " + practice.findDuplicates(numbers));
        System.out.println("10. Square of First 3 Even: " + practice.squareFirstThreeEven(numbers));
        System.out.println("11. Uppercase Strings: " + practice.toUpperCaseList(names));
        System.out.println("12. Concatenated Strings: " + practice.concatenateStrings(names));
        System.out.println("13. Starts with A: " + practice.countStringsStartingWith(names, 'A'));
        System.out.println("14. Remove Duplicate Words: " + practice.removeDuplicateWords("apple banana apple orange banana"));
        System.out.println("15. Word Frequency: " + practice.wordFrequency("apple banana apple orange banana"));
        System.out.println("16. Group Names by First Letter: " + practice.groupNamesByFirstLetter(names));
        System.out.println("17. Merged & Sorted Arrays: " + Arrays.toString(practice.mergeAndSortArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6})));
        System.out.println("18. Merged Unique Strings: " + practice.mergeUniqueStrings(Arrays.asList("one", "two"), Arrays.asList("two", "three")));
        System.out.println("19. Palindromes: " + practice.filterPalindromes(words));
        System.out.println("20. Even/Odd Partition: " + practice.partitionEvenOdd(numbers));
        System.out.println("21. Employees Sorted by Name: " + practice.sortEmployeesByName(employees));
        System.out.println("22. Employees Sorted by Name & Salary: " + practice.sortEmployeesByNameAndSalary(employees));
        System.out.println("23. Group by Department: " + practice.groupByDepartment(employees));
        System.out.println("24. IT Department Employees: " + practice.getEmployeesByDepartment(employees, "IT"));
        System.out.println("25. Grades Pass/Fail: " + practice.classifyGrades(Map.of("Alice", 85, "Bob", 40), 50));
        System.out.println("26. Map Sorted by Keys: " + practice.sortMapByKeys(Map.of("b", 2, "a", 1)));
        System.out.println("26. Map Sorted by Values: " + practice.sortMapByValues(Map.of("b", 2, "a", 1)));
        System.out.println("27. Group Employees (again) by Dept: " + practice.groupEmployeesByDept(employees));
        System.out.println("28. Average Salary by Dept: " + practice.averageSalaryByDept(employees));
        System.out.println("29. Sum Salary by Dept: " + practice.sumSalaryByDept(employees));
        System.out.println("30. Highest Paid by Dept: " + practice.highestPaidByDept(employees));
        System.out.println("30. Lowest Paid by Dept: " + practice.lowestPaidByDept(employees));
        System.out.println("31. Group by Dept and Gender: " + practice.groupByDeptAndGender(employees));
        System.out.println("32. Group Strings by Length: " + practice.groupByStringLength(words));
        System.out.println("33. Word Occurrences: " + practice.countWordOccurrences("hi hi hello world hello"));
        System.out.println("34. Reverse Each Word: " + practice.reverseEachWord("Java is awesome"));
        System.out.println("35. Unique Words in Paragraph: " + practice.findUniqueWords("Java is fun. Java is powerful. Enjoy Java!"));
        System.out.println("36. Unique Skills from Employees: " + practice.uniqueSkills(employees));

        // 37. Demonstrate map() and flatMap()
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d")
        );
        practice.demonstrateMapAndFlatMap(nestedList);
    }


    // 1. Find the second largest number in a list
    public Optional<Integer> findSecondLargest(List<Integer> list) { return Optional.empty(); }

    // 2. Find all even numbers in a list
    public List<Integer> getEvenNumbers(List<Integer> list) { return null; }

    // 3. Remove duplicate elements from a list
    public <T> List<T> removeDuplicates(List<T> list) { return null; }

    // 4. Find the sum of all elements in a list
    public int sumOfList(List<Integer> list) { return 0; }

    // 5. Find the max/min of a list
    public Optional<Integer> findMax(List<Integer> list) { return Optional.empty(); }
    public Optional<Integer> findMin(List<Integer> list) { return Optional.empty(); }

    // 6. Find the average of a list
    public OptionalDouble findAverage(List<Integer> list) { return OptionalDouble.empty(); }

    // 7. Check if all elements in a list are even
    public boolean areAllEven(List<Integer> list) { return false; }

    // 8. Find numbers starting with 1 in a list
    public List<Integer> numbersStartingWithOne(List<Integer> list) { return null; }

    // 9. Find and print all duplicate numbers in a list
    public Set<Integer> findDuplicates(List<Integer> list) { return null; }

    // 10. Find the square of the first three even numbers
    public List<Integer> squareFirstThreeEven(List<Integer> list) { return null; }

    // 11. Convert a list of strings to uppercase
    public List<String> toUpperCaseList(List<String> list) { return null; }

    // 12. Concatenate all strings in a list
    public String concatenateStrings(List<String> list) { return null; }

    // 13. Count strings starting with a specific character
    public long countStringsStartingWith(List<String> list, char c) { return 0; }

    // 14. Remove duplicate words from a string
    public String removeDuplicateWords(String input) { return null; }

    // 15. Count word frequency in a string
    public Map<String, Long> wordFrequency(String input) { return null; }

    // 16. Group names by their first letter and count each group
    public Map<Character, Long> groupNamesByFirstLetter(List<String> names) { return null; }

    // 17. Merge two integer arrays into a sorted array
    public int[] mergeAndSortArrays(int[] a, int[] b) { return null; }

    // 18. Concatenate two string lists and remove duplicates
    public List<String> mergeUniqueStrings(List<String> list1, List<String> list2) { return null; }

    // 19. Filter palindrome words from a list
    public List<String> filterPalindromes(List<String> words) { return null; }

    // 20. Partition a list into even and odd numbers
    public Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> list) { return null; }

    // 21. Sort a list of employees by name
    public List<Employee> sortEmployeesByName(List<Employee> employees) { return null; }

    // 22. Sort employees by name and salary
    public List<Employee> sortEmployeesByNameAndSalary(List<Employee> employees) { return null; }

    // 23. Group employees by department
    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) { return null; }

    // 24. Find employees of a particular department
    public List<Employee> getEmployeesByDepartment(List<Employee> employees, String department) { return null; }

    // 25. Classify student grades as PASS or FAIL
    public Map<String, String> classifyGrades(Map<String, Integer> studentMarks, int passMark) { return null; }

    // 26. Sort a map by keys or values
    public Map<String, Integer> sortMapByKeys(Map<String, Integer> map) { return null; }
    public Map<String, Integer> sortMapByValues(Map<String, Integer> map) { return null; }

    // 27. Group employees by department (revisited)
    public Map<String, List<Employee>> groupEmployeesByDept(List<Employee> employees) { return null; }

    // 28. Find average salary in each department
    public Map<String, Double> averageSalaryByDept(List<Employee> employees) { return null; }

    // 29. Sum salaries by department
    public Map<String, Double> sumSalaryByDept(List<Employee> employees) { return null; }

    // 30. Find highest/lowest paid employees in each department
    public Map<String, Optional<Employee>> highestPaidByDept(List<Employee> employees) { return null; }
    public Map<String, Optional<Employee>> lowestPaidByDept(List<Employee> employees) { return null; }

    // 31. Group employees by department and gender
    public Map<String, Map<String, List<Employee>>> groupByDeptAndGender(List<Employee> employees) { return null; }

    // 32. Group strings by their length
    public Map<Integer, List<String>> groupByStringLength(List<String> strings) { return null; }

    // 33. Count occurrences of each word in a sentence
    public Map<String, Long> countWordOccurrences(String sentence) { return null; }

    // 34. Reverse each word in a string
    public String reverseEachWord(String input) { return null; }

    // 35. Count and find unique words across paragraphs
    public Set<String> findUniqueWords(String paragraph) { return null; }

    // 36. Find all unique skills from a list of employees
    public Set<String> uniqueSkills(List<Employee> employees) { return null; }

    // 37. Understand map() and flatMap() with examples
    public void demonstrateMapAndFlatMap(List<List<String>> nestedList) {
        // Implement with map() and flatMap()
    }

    // Helper class: Employee
    public static class Employee {
        private String name;
        private String department;
        private String gender;
        private double salary;
        private List<String> skills;

        // Constructor, getters, setters
        public Employee(String name, String department, String gender, double salary, List<String> skills) {
            this.name = name;
            this.department = department;
            this.gender = gender;
            this.salary = salary;
            this.skills = skills;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public String getGender() { return gender; }
        public double getSalary() { return salary; }
        public List<String> getSkills() { return skills; }
    }
}
