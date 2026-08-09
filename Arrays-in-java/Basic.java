
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // An array is a linear data structure which store element of similiar type into a contigous fashion or manner 
        // It has mutability property always start with zero index 
        // int s1 = 5;
        // int s2 = 6;
        // int s3 = 7;
        // int s4 =8;
        // Remark ----> Note this approch is not feasible so that why array comes introduction 
        // Approch - 1 : Initializing the array with values 
        int[] arr = {5, 6, 7, 8};   // array has been create and it is properly storing the values 

        // update value of array 
        arr[3] = 9;
        // Trying to accesss each values 
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);

        // trying to print the each value of element using loop with loop variable 
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Approch -2 
        // creating an array 
        int[] arr3 = new int[5]; // an array of size 5 with value 0 is creating on heap 
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        sc.close();
    }
}
