import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Number:");
        int num = input.nextInt();
        long fact = Fact(num);
        System.out.println("Factorial is:"+ fact);

        
    }
    public static long Fact( int num){
        if(num<2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i<= num){
            fact *=i;
            i++;

        }
        return fact;





    }
    
}
