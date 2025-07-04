import java.util.Scanner;

public class BitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the bit position (starting from 0): ");
        
        int n = scanner.nextInt();
        boolean isSet = (num & (1 << n)) != 0;
        System.out.println("The " + n + "-th bit of number " + num + " is " + (isSet ? "set (1)" : "not set (0)"));

        scanner.close();
    }
}
