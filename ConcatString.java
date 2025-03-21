import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Concatenating the strings
        String result = str1 + str2; // or use str1.concat(str2)

        // Displaying the result
        System.out.println("Concatenated String: " + result);

        sc.close();
    }
}
