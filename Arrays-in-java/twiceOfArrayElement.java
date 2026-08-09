
import java.util.Scanner;

public class twiceOfArrayElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; // creating an array of size 5 with default value 0 at each index 

        // loop to take input from user into array 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // loop to print array element 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(2 * arr[i] + " ");
        }

        sc.close();
    }
}
