import java.util.Scanner;

public class ArraySortAndOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 0, 9, 5, 1, 8, 2}; 

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.print("\nEnter a number to count its occurrences: ");
        int num = sc.nextInt();

        int count = 0;
        for (int value : arr) {
            if (value == num) {
                count++;
            }
        }

        System.out.println(num + " appears " + count + " time(s).");

        sc.close();
    }
}

