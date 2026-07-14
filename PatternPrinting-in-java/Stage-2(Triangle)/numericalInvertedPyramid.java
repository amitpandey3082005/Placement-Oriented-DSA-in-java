
import java.util.Scanner;

public class numericalInvertedPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        // Pattern 1 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

      // pattern 2 

       for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }


        System.out.println();

        // pattern 3
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
