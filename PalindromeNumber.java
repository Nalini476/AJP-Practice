import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int originalNumber = scanner.nextInt();

        int reversedNumber = 0;
        int tempNumber = originalNumber; 

        while (tempNumber > 0) {
            int digit = tempNumber % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            tempNumber /= 10; 
        }

    
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }

        scanner.close();
    }
}