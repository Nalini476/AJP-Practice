import java.util.Scanner;

public class StrongNumCheck {
    // Method to calculate factorial of a digit
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        // Calculate sum of factorial of each digit
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        // Check if number is Strong
        if (sum == original) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is not a Strong Number.");
        }

        scanner.close();
    }
}
