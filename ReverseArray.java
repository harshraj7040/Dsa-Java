import java.util.Scanner;

public class ReverseArray {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
           arr[i]= input.nextInt();
        }
        reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        
    }
    

    static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
    
}
