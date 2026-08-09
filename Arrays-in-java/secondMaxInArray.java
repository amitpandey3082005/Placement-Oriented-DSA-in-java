import java.util.Scanner;

public class secondMaxInArray {
    public static int targetSum1Loop(int[] arr) {

    if (arr == null || arr.length < 2) return -1;

    int max = Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        // check for max element 
        if (arr[i] > max) {
            smax = max;    
            max = arr[i]; 
        }
        
        else if (arr[i] > smax && arr[i] != max) {
            smax = arr[i];
        }
    }

    // if all elements are same then return -1 
    if (smax == Integer.MIN_VALUE) return -1;

    return smax;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        sc.close();
    }
}