
import java.util.Scanner;

public class alphabeticalInvertedPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

// pattern -1 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // pattern -2  
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // pattern -3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
        System.out.println();

        // pattern-4
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char) (i + 96) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
