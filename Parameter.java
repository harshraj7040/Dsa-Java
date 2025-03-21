public class Parameter {
    public static void main(String[] args) {
        int num = sum(4,7);
        System.out.println(num);

        
    }
    public static int sum(int first, int second){
        System.out.println("First number received:" + first);
        System.out.println("Second number received:" + second);
        int sum = first + second;
        return sum;

    }
    
}
