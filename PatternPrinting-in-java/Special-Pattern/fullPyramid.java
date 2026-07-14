
import java.util.Scanner;

public class fullPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        // Approch -1
        for (int i = 1; i <= n; i++) {
            // spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars 
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Adding for next line after each row
        }
        System.out.println();

        // Approch -2
        int nsp=n-1,nst=1;
        for(int i=1;i<=n;i++){
            // loop for printings spaces 
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            // loop for printing star
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            
            nsp--;nst+=2; // crucial step for printing pyramid i
            System.out.println(); // Adding next line after each row  
        }
        sc.close();
    }
}
