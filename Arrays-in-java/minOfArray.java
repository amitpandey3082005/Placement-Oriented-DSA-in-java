import java.util.Scanner;

public class minOfArray {
    public static int printMinOfArray(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if (arr[i]<min) min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {2,3,-7,9,8,-8};

       System.out.println("Minimum Element is : "+ printMinOfArray(arr));
        
        sc.close();
    }
}