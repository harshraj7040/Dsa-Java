import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class LeapYear {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in){
            System.out.println("Welcome to our Calculator\n");
            System.out.print("Please enter your year ");
            int year = input.nextInt();
            if (year % 400 == 0){
                System.out.println("Your year is a Leap Year");
            }else if( year % 100 ==0 && year % 4 == 0){
                System.out.println("Your year is not a leap year");
            }else{
                System.out.println("Your year is not a leap year");
            }

    
            

            
        }
     }
}
