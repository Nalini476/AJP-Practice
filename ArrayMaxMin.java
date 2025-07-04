import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter value " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
            } else if(min > arr[i]) {
                min = arr[i];
            }
        }
        
        System.out.println("Max value = " + max + ", Min value = " + min);
    }
}
