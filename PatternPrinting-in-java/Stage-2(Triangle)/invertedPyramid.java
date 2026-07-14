import java.util.Scanner;

public class invertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();

        // Approch -1 

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){ // i+Jmax = n+1 i.e Jmax = n+1-i
                System.out.print("* ");
            }
            System.out.println();// Adding new line 
        }

        System.out.println();
        
        // Approch -2  using 3rd variable 
        int a=n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print("* ");
            }
            a--;
            System.out.println(); // Adding next line after each row 
        }

        System.out.println();
        // Approch -3  ( Note this is not t he standard template for inverted triangle )

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
