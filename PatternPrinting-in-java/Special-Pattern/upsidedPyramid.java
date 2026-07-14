import java.util.Scanner;

public class upsidedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            // loop for printing spaces 
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }

            // loop for printing star
            for(int j=1;j<=n-i+1;j++){
               System.out.print("* ");
            }
            System.out.println(); // Adding next line after each row 
        }
        
        sc.close();
    }
}