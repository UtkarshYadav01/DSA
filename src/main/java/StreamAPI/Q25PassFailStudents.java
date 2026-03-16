package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q25PassFailStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Narendra", 35),
                new Student("Kiran", 70),
                new Student("Ravi", 65),
                new Student("Hari", 75),
                new Student("Sima", 87),
                new Student("Muskan", 33),
                new Student("Hari", 60),
                new Student("Subha", 90),
                new Student("Dillip", 76));

        Map<String, List<Student>> collect = students.stream()
                .collect(Collectors.groupingBy(s -> s.getMarks() >= 60 ? "PASS" : "FAIL"));

        System.out.println(collect);
    }
}

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}