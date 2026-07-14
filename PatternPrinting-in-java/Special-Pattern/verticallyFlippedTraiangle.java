
import java.util.Scanner;

public class verticallyFlippedTraiangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        // Approch -1 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if((i+j > n)) System.out.print("*");
        //         else System.out.print(" ");
        //     }
        //     System.out.println(); // Adding next Line after each row
        // }
        // Approch -2
        for (int i = 1; i <= n; i++) {

            // loop for prining spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // loop for printing star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Adding next line after each row 
        }
        sc.close();
    }
}
