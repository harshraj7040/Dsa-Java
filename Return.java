import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        
        int second = readNumber();
        int sum = first + second;
        System.out.println("Sum of the numbers is:" + sum);
    }
    public static void greet() {
        System.out.println("Welcome");
        
    }
    public static int readNumber() {
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number= input.nextInt();
        return number; 

    } 
    
}
