import java.util.ArrayList;
import java.util.List;

public class StringCombinations {
    public static void main(String[] args) {
        String[] inputStrings = {"abc", "qwe"}; // Example input (n=2, k=3)
        List<String> result = generateCombinations(inputStrings);
        
        // Print the generated output strings
        for (String s : result) {
            System.out.println(s);
        }
        
        // Print the total count (should be k^n)
        System.out.println("Total count: " + result.size());
    }

    public static List<String> generateCombinations(String[] inputStrings) {
        List<String> result = new ArrayList<>();
        generateRecursive(inputStrings, 0, "", result);
        return result;
    }

    private static void generateRecursive(String[] inputStrings, int index, String current, List<String> result) {
        if (index == inputStrings.length) {
            result.add(current);
            return;
        }
        
        for (char c : inputStrings[index].toCharArray()) {
            generateRecursive(inputStrings, index + 1, current + c, result);
        }
    }
    
}
