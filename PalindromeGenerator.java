import java.util.*;

public class PalindromeGenerator {
    public static void main(String[] args) {
        String[] inputStrings = {"ab", "bax", "bba", "xy", "py", "ypa", "a", "abb"};
        Set<String> palindromeSet = new TreeSet<>(); 
        generatePalindromes(inputStrings, "", 9, palindromeSet);

        
        System.out.println(palindromeSet.size());

        
        System.out.println(String.join(", ", palindromeSet));
    }

    private static void generatePalindromes(String[] inputStrings, String current, int maxLength, Set<String> result) {
        if (current.length() > 0 && current.length() <= maxLength && isPalindrome(current)) {
            result.add(current);
        }
        if (current.length() >= maxLength) {
            return;
        }
        
       
        for (String s : inputStrings) {
            generatePalindromes(inputStrings, current + s, maxLength, result);
        }
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
