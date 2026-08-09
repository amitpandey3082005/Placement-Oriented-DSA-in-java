import java.util.Scanner;

public class maxOfArrayElemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {-7,-3,-9,0,-7,-6};

      //  int max =arr[0]; // you also set max with lowest integer value in java i.e. Integer.MIN_VAlUE
        int max1 = Integer.MIN_VALUE;
        // loop to check max 
        for(int i=0;i<arr.length;i++){
           if(arr[i] > max1 ) max1 = arr[i];
        }

        System.out.println("Largest Element in An Array is : " + max1);
        
        sc.close();
    }
}