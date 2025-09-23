public class test {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 2, 40, 32, 52};
        String s="[2{3*(1+3)}-3]";//231+3-3
        findSecondLargest(arr);
    }

    private static void findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                secondlargest = largest;
                largest = i;
            } else if (i != largest && i > secondlargest) {
                secondlargest = i;
            }
        }
        System.out.println(secondlargest);
    }
}
