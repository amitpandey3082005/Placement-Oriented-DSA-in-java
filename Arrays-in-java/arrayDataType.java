// Array always store values of similar type (Homogenous element in a contigous manner with 0 based index by default )

import java.util.Scanner;

public class arrayDataType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4}; // array storing integer only 
        char[] arr1 = {'a', 'b', 'c'};// array storing charecter only 
        String[] arr2 = {"Amit", "Sumit", "Alok"};// array storing string of array  only 
        double[] dr = {23.4, 4.8, 78.9};// array storing double value only 

        // trying to print array 
        for (int i = 0; i < arr2.length; i++) { // note array_name.length 
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}

