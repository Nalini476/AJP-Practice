
public class ArraySort {
    public static void main(String args[]) {
        int arr[] = {2, 0, 9, 5, 1, 8};
        int temp;

        // Sorting using simple selection sort or bubble sort logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
