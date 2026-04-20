record Employee(int id, String name) {
}

record Employees(String name, String department, int salary) {
}

record EmployeesWithGender(String name, String department, String gender, int salary) {
}

record EmployeeSkills(String name, List<String> skills) {
}

void main() {
    var list = Arrays.asList(2, 1, 6, 3, 4, 5, 5, 2, 8);

    System.out.println("Question - 01 - Find the second largest number of a list");
    list.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .limit(1)
            .forEach(System.out::println);
    System.out.println();

    System.out.println("Question - 02 - Find out all the even numbers of a given list");
    list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    System.out.println();

    System.out.println("Question - 06 -Find the average of a given list");
    System.out.println(list.stream()
            .mapToDouble(i -> i).average().getAsDouble());
    System.out.println();

    System.out.println("Question-09-Find all duplicates numbers of a list & Print them");
    list.stream()
            .filter(n -> Collections.frequency(list, n) > 1).distinct().forEach(System.out::println);
    System.out.println();

    System.out.println("Question-10-Find the square of the first three even numbers");
    list.stream()
            .sorted()
            .filter(n -> n % 2 == 0)
            .limit(3)
            .map(n -> n * n)
            .forEach(System.out::println);
    System.out.println();

    List<String> fruits = Arrays.asList("Apple", "Banana", "Guava", "cherry", "coconut", "Berry");

    System.out.println("Question-11-Convert a list of string to upper case");
    fruits.stream()
            .map(s -> s.toUpperCase())
            .forEach(System.out::println);
    System.out.println();

    System.out.println("Question-12-Concatenate all the string of a given list of string");
    System.out.println(fruits.stream().collect(Collectors.joining(",")));
    System.out.println();

    System.out.println("Question-13-Count number of string which starts with a specific char");
    System.out.println(fruits.stream().filter(s -> s.startsWith("B")).count());
    System.out.println();

    String str = "This is Java language and Java is versatile language ";
    System.out.println("Question-14-Remove duplicate words of a given string");
    Arrays.stream(str.split(" "))
            .distinct().forEach(System.out::println);
    System.out.println();

    System.out.println("Question-15-Count words frequency in a given string");
    var val = Arrays.stream(str.split(" "))
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    System.out.println(val);
    System.out.println();

    System.out.println("Question-16-Group names by their first letter & count of each group");
    String[] names = {"Anand", "Bipin", "Rakesh", "Abhi", "Rohan", "Akash", "Ravi", "Sima"};
    Map<Character, Long> collect = Arrays.stream(names)
            .collect(Collectors.groupingBy(n -> n.charAt(0), Collectors.counting()));
    System.out.println(collect);
    System.out.println();

    System.out.println("Question-17-How do you merge 2 integer arrays into a sorted array");

    System.out.println("Question-18-Concatenate two list of strings & remove duplicates");

    System.out.println("Question-19-Filter all the palindrome words of a list using stream");
    String[] palindrome = {"abc", "ada", "Kiran", "level", "apple", "narendra", "madam"};
    Arrays.stream(palindrome)
            .filter(w -> w.equals(new StringBuilder(w).reverse().toString())).forEach(System.out::println);
    System.out.println();

    System.out.println("Question-20-Partition a list of numbers into 2 groups: even and odd");
    var val3 = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
    System.out.println(val3);
    System.out.println();

    System.out.println("Question-21-sort a list of employees by employee name using stream");
    List<Employee> empList = Arrays.asList(new Employee(123, "Narendra Sahoo"),
            new Employee(456, "Abhay Parida"),
            new Employee(876, "Dilip Singh"));
    empList.stream()
            .sorted(Comparator.comparing(e -> e.id(), Comparator.reverseOrder()))
            .forEach(System.out::println);
    System.out.println();

    System.out.println(" Question-26-How to sort a Map based on keys or values using stream?");
    Map<String, Integer> map = new HashMap<>();
    map.put("Utkarsh Yadav", 25);
    map.put("Kiran Gupta", 21);
    map.put("Gopal Rajpal", 45);
    map.put("Hari", 65);
    map.put("Ruhi", 2);
    map.put("Manas", 44);

    map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(System.out::println);
    System.out.println();

    System.out.println("Question-27-How to group employees by their department");
    List<Employees> employees = List.of(
            new Employees("Kiran", "HR", 60000),
            new Employees("Ravi", "IT", 90000),
            new Employees("Hari", "IT", 110000),
            new Employees("Dilip", "HR", 70000),
            new Employees("Mira", "Sales", 50000));

    Map<String, List<Employees>> grpemp = employees.stream()
            .collect(Collectors.groupingBy(Employees::department));
    System.out.println(grpemp);
    System.out.println();

    System.out.println("Question-28-Find the Average of Salaries in Each Department");
    var avgGrp = employees.stream()
            .collect(Collectors.groupingBy(Employees::department,
                    Collectors.averagingDouble(Employees::salary)));
    System.out.println(avgGrp);
    System.out.println();

    System.out.println("Question-29-Sum the Salaries of Employees by Department");
    var sumGrp = employees.stream()
            .collect(Collectors.groupingBy(Employees::department,
                    Collectors.summingInt(Employees::salary)));
    System.out.println(sumGrp);
    System.out.println();

    System.out.println("Question30-Find the highest/lowest paid employees in each department");
    var lowestGrp = employees.stream()
            .collect(Collectors.groupingBy(Employees::department,
                    Collectors.minBy(Comparator.comparingDouble(Employees::salary))));
    System.out.println(lowestGrp);
    System.out.println();

    System.out.println("Question-31-How to group employees by department and then by gender");
    List<EmployeesWithGender> employeesWithGenders = List.of(
            new EmployeesWithGender("Kiran", "HR", "Female", 60000),
            new EmployeesWithGender("Ravi", "IT", " Male", 90000),
            new EmployeesWithGender("Hari", "IT", "Male", 110000),
            new EmployeesWithGender("Dillip", "HR", "Male", 70000),
            new EmployeesWithGender("Mira", "Sales", "Female", 50000));

    var grpByDepThenName = employeesWithGenders.stream()
            .collect(Collectors.groupingBy(EmployeesWithGender::department,
                    Collectors.groupingBy(EmployeesWithGender::gender)));
    System.out.println(grpByDepThenName);
    System.out.println();

    System.out.println("Question-32-Group strings by their length");
    var words = Arrays.asList("a", "bb", "Mira", "ccc", "dd", "eee", "f", "Sila", "Nita");
    var strLen = words.stream().collect(Collectors.groupingBy(String::length));
    System.out.println(strLen);

    System.out.println("Question-33- Count the occurrences of each word in a sentence");
    String sentence = "this is a test this is only a test";
    System.out.println(Arrays.stream(sentence.split(" "))
            .collect(Collectors.groupingBy(s -> s, Collectors.counting())));
    System.out.println();

    System.out.println("Question-34- How to Reverse each word in a string");
    String sentence2 = "hello world java";
    System.out.println(
            Arrays.stream(sentence2.split(" "))
                    .map(s -> new StringBuilder(s).reverse().toString())
                    .collect(Collectors.joining(" ")));
    System.out.println();

    System.out.println("Question-35- Count & find unique words across a list of paragraphs");
    var paragraphs = Arrays.asList("Java is great",
            "Streams are powerful",
            "Flatmap is useful");

    var count = paragraphs.stream()
            .flatMap(p -> Arrays.stream(p.split(" ")))
            .count();
    System.out.print(count + ", ");

    var ga = paragraphs.stream()
            .flatMap(p -> Arrays.stream(p.split(" ")))
            .distinct()
            .collect(Collectors.toList());
    System.out.println(ga);
    System.out.println();

    System.out.println("Question-36- Find all unique skills from a list of employees");
    List<EmployeeSkills> employeeSkills = Arrays.asList(
            new EmployeeSkills("Dillip", Arrays.asList("Java", "Spring", "SQL")),
            new EmployeeSkills("Kiran", Arrays.asList("Java", "React", "AWS")),
            new EmployeeSkills("Ravi", Arrays.asList("Python", ".Net", "AWS"))
    );

    employeeSkills.stream()
            .map(es -> es.skills())
            .flatMap(s -> s.stream())
            .distinct()
            .forEach(System.out::println);
    System.out.println("\n2nd approach\n");

    //2nd approach
    var lastSol = employeeSkills.stream()
            .flatMap(e -> e.skills().stream())
            .collect(Collectors.toSet());
    System.out.println(lastSol);

    System.out.println();
    System.out.println("end");
}