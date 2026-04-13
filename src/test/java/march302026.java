void main() {

    // Sum of even numbers from array
    int[] num = {1, 2, 3, 4, 5, 6, 7};
    int sum1 = Arrays.stream(num)
            .filter(n -> n % 2 == 0)
            .sum();
    System.out.println(sum1);

    // Using List
    var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    int sum2 = list.stream()
            .filter(n -> n % 2 == 0)
            .reduce(0, (a, b) -> a + b);
    System.out.println(sum2);
}