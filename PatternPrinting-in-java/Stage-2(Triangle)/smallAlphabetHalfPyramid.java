
import java.util.Scanner;

public class smallAlphabetHalfPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(j+'a') + " ");
            }
            System.out.println(); // Adding new lines 
        }

        System.out.println();

        // for same small letter pyramid 

         for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(i+96) + " ");
            }
            System.out.println(); // Adding new lines 
        }


        sc.close();
    }
}
