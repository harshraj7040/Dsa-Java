import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length/2; i++){
            int t = arr[i];
            arr[i] = arr[arr.length -1 -i ];
            arr[arr.length -1-i] = t;

        }
        Syste+ Arrays.toString(arr));
    }
    
}
