
import java.util.Scanner;

public class alphabetHalfPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(j+'A') + " ");
            }
            System.out.println(); // Adding new lines 
        }

        System.out.println();

         for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println(); // Adding new lines 
        }

        sc.close();
    }
}
