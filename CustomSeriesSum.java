//term  1+2+4+7+11= 25
//position 1,2,3,4,5,

//find the sum of this series given input as n by the user 

//lets say n=5

//1+2+4+7+11 = 25 

import java.util.Scanner;

public class CustomSeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = 0, term = 1; 
        
        for (int i = 1; i <= n; i++) {
            sum += term;
            term += (i); 
        }
        
        System.out.println("Sum of the series up to " + n + " terms: " + sum);
    }
    
}


