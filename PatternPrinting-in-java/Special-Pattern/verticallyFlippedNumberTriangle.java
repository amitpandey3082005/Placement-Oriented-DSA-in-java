import java.util.Scanner;

public class verticallyFlippedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();
       
        // Approch -1
        // for(int i=1;i<=n;i++){
        //     // creating variable for printing integers 
        //     int a=1;
        //     // loop for printing spaces 
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     // for printing numbers 
        //     for(int j=1;j<=i;j++){
        //         System.out.print(a++);
        //     }
        //     System.out.println(); // Adding next line 
        // }

        // Approch -2

        for(int i=1;i<=n;i++){
            // creating variable for printing integers 
            
            // loop for printing spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // for printing numbers 
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(); // Adding next line 
        }

        System.out.println();

        // creating Alphabetical vertically flipped triangle 

        for(int i=1;i<=n;i++){
            // creating variable for printing integers 
            
            // loop for printing spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // for printing numbers 
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println(); // Adding next line 
        }
        
        sc.close();
    }
}