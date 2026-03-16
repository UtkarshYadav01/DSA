package on;

import StreamAPI.Java8PracticeSet;

import java.util.*;

public class March11_2025SStreamApiPractice extends Java8PracticeSet {
    
    public Optional<Integer> findMin(List<Integer> list) {
        
        return null;
    }

    @Override
    public Optional<Integer> findSecondLargest(List<Integer> list) {
        return list.stream()
                .distinct()                 // remove duplicates
                .sorted(Comparator.reverseOrder()) // sort descending
                .skip(1)                    // skip the largest
                .findFirst();
    }

    @Override
    public List<Integer> getEvenNumbers(List<Integer> list) {
        return super.getEvenNumbers(list);
    }

    @Override
    public <T> List<T> removeDuplicates(List<T> list) {
        return super.removeDuplicates(list);
    }

    @Override
    public int sumOfList(List<Integer> list) {
        return super.sumOfList(list);
    }

    @Override
    public Optional<Integer> findMax(List<Integer> list) {
        return super.findMax(list);
    }

    @Override
    public OptionalDouble findAverage(List<Integer> list) {
        return super.findAverage(list);
    }

    @Override
    public boolean areAllEven(List<Integer> list) {
        return super.areAllEven(list);
    }

    @Override
    public List<Integer> numbersStartingWithOne(List<Integer> list) {
        return super.numbersStartingWithOne(list);
    }

    @Override
    public Set<Integer> findDuplicates(List<Integer> list) {
        return super.findDuplicates(list);
    }

    @Override
    public List<Integer> squareFirstThreeEven(List<Integer> list) {
        return super.squareFirstThreeEven(list);
    }

    @Override
    public List<String> toUpperCaseList(List<String> list) {
        return super.toUpperCaseList(list);
    }

    @Override
    public String concatenateStrings(List<String> list) {
        return super.concatenateStrings(list);
    }

    @Override
    public long countStringsStartingWith(List<String> list, char c) {
        return super.countStringsStartingWith(list, c);
    }

    @Override
    public String removeDuplicateWords(String input) {
        return super.removeDuplicateWords(input);
    }

    @Override
    public Map<String, Long> wordFrequency(String input) {
        return super.wordFrequency(input);
    }

    @Override
    public Map<Character, Long> groupNamesByFirstLetter(List<String> names) {
        return super.groupNamesByFirstLetter(names);
    }

    @Override
    public int[] mergeAndSortArrays(int[] a, int[] b) {
        return super.mergeAndSortArrays(a, b);
    }

    @Override
    public List<String> mergeUniqueStrings(List<String> list1, List<String> list2) {
        return super.mergeUniqueStrings(list1, list2);
    }

    @Override
    public List<String> filterPalindromes(List<String> words) {
        return super.filterPalindromes(words);
    }

    @Override
    public Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> list) {
        return super.partitionEvenOdd(list);
    }

    @Override
    public List<Employee> sortEmployeesByName(List<Employee> employees) {
        return super.sortEmployeesByName(employees);
    }

    @Override
    public List<Employee> sortEmployeesByNameAndSalary(List<Employee> employees) {
        return super.sortEmployeesByNameAndSalary(employees);
    }

    @Override
    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return super.groupByDepartment(employees);
    }

    @Override
    public List<Employee> getEmployeesByDepartment(List<Employee> employees, String department) {
        return super.getEmployeesByDepartment(employees, department);
    }

    @Override
    public Map<String, String> classifyGrades(Map<String, Integer> studentMarks, int passMark) {
        return super.classifyGrades(studentMarks, passMark);
    }

    @Override
    public Map<String, Integer> sortMapByKeys(Map<String, Integer> map) {
        return super.sortMapByKeys(map);
    }

    @Override
    public Map<String, Integer> sortMapByValues(Map<String, Integer> map) {
        return super.sortMapByValues(map);
    }

    @Override
    public Map<String, List<Employee>> groupEmployeesByDept(List<Employee> employees) {
        return super.groupEmployeesByDept(employees);
    }

    @Override
    public Map<String, Double> averageSalaryByDept(List<Employee> employees) {
        return super.averageSalaryByDept(employees);
    }

    @Override
    public Map<String, Double> sumSalaryByDept(List<Employee> employees) {
        return super.sumSalaryByDept(employees);
    }

    @Override
    public Map<String, Optional<Employee>> highestPaidByDept(List<Employee> employees) {
        return super.highestPaidByDept(employees);
    }

    @Override
    public Map<String, Optional<Employee>> lowestPaidByDept(List<Employee> employees) {
        return super.lowestPaidByDept(employees);
    }

    @Override
    public Map<String, Map<String, List<Employee>>> groupByDeptAndGender(List<Employee> employees) {
        return super.groupByDeptAndGender(employees);
    }

    @Override
    public Map<Integer, List<String>> groupByStringLength(List<String> strings) {
        return super.groupByStringLength(strings);
    }

    @Override
    public Map<String, Long> countWordOccurrences(String sentence) {
        return super.countWordOccurrences(sentence);
    }

    @Override
    public String reverseEachWord(String input) {
        return super.reverseEachWord(input);
    }

    @Override
    public Set<String> findUniqueWords(String paragraph) {
        return super.findUniqueWords(paragraph);
    }

    @Override
    public Set<String> uniqueSkills(List<Employee> employees) {
        return super.uniqueSkills(employees);
    }

    @Override
    public void demonstrateMapAndFlatMap(List<List<String>> nestedList) {
        super.demonstrateMapAndFlatMap(nestedList);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
