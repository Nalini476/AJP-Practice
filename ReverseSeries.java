 import java.util.Scanner;

public class ReverseSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] series = new int[n];
        System.out.println("Enter the series of numbers:");
        for (int i = 0; i < n; i++) {
            series[i] = scanner.nextInt();
        }

        System.out.println("Reversed series:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(series[i] + " ");
        }

     scanner.close();

    }
}