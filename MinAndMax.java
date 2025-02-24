public class MinAndMax {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 40, 50, 2, 70};

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
    
}
