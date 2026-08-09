
import java.util.Scanner;

public class passByRefrence {

    // defining a function to print array 
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // defining a function to print square of each element 
    public static void printSquare(int[] arr1) { // here arr is refrence vriable pointing to element of 0th index of arr
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] *= arr1[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // taking input 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // calling function to print square of each element of array arr as a shallow copy i.e. change in original array with the help of refrence variable 
        printSquare(arr);

        print(arr); // method call toprint Array i.e. this method is working very well and changing the actual array values 

        sc.close();
    }
}
