
import java.util.Scanner;

public class printNegativeElementOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking size of an array from user input 
        System.out.println("Enter the Size of an Array:");
        int n = sc.nextInt();

        int[] arr = new int[n]; // creating array of n size with default value 0 at each index 

        System.out.println("Enter Array Element : ");

        // loop to take input 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // loop to print negative element of an array 
        for (int i = arr.length - 1; i > 0; i--) { // note to print array element in reverse order always start with arr.length-1 not with arr.length it will return an exception IndexOutOFBound
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
