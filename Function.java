public class Function {
    public static void main(String[] args) {
        printFirstPattern();

        
    }
    public static void printFirstPattern(){
        //System.out.println("*");
        //System.out.println("**");
        //System.out.println("***");
        //System.out.println("****");


        int rows = 0;
        while(rows <5){
            System.out.println("*");
            int i = 0;
            while(i< rows){
                System.out.println(" *");
                i++;
            }
            rows++;
        }
    }
    
}
