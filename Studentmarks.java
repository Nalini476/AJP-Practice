import java.util.Scanner;

public class Studentmarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        
        marks[0] = 70;
        marks[1] = 80;
        marks[2] = 58;
        marks[3] = 90;
        marks[4] = 34;

        for (int mark : marks) {
            total += mark;
        }

        double percentage = (double) total / 5;
        char grade;
        switch ((int) percentage / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
        }
        
        System.out.println("Marks: 70, 80, 58, 90, 34");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
