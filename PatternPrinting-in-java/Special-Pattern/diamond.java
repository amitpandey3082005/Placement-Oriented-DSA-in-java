import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();

       int nsp=n-1,nst=1;
        for(int i=1;i<=n;i++){
            // loop for printing space
            for(int j=1;j<=nsp;j++){
                  System.out.print("  ");
            } 
            //loop for printing star 
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println(); // Adding next line after each row 
        }
        nsp=1;nst-=4; // or nst = 2n-3 logic 
        for(int i=1;i<=n-1;i++){
            // loop for printing space 
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            // loop for printing star 
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();// Adding next line after each row
        }
        
        sc.close();
    }
}