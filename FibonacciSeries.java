

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = scanner.nextInt();  // Fixed typo here
        scanner.close();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");  // Changed to print instead of println
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
