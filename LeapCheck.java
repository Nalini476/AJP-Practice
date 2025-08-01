import java.util.Scanner;

public class LeapCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year from user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
