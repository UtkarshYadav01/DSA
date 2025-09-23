package Patterns;

public class Patterns {
    public static void main(String[] args) {
        printPattern2(4);
    }

    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }

    private static void printPattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
