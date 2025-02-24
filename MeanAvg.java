public class MeanAvg {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double mean = (double) sum / numbers.length;
        System.out.println("Mean (Average): " + mean);
    }
    
}
