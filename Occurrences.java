      import java.util.Scanner;
      
      public class Occurrences {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 2, 4, 2}; 

        System.out.print("Enter the number to count: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        System.out.println(num + " appears " + count + " time(s).");
    }
}

