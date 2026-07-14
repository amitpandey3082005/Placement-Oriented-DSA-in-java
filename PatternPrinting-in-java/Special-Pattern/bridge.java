
import java.util.Scanner;

public class bridge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        
        int nst=n,nsp=1;
        for(int i=1;i<=(2*n+1);i++){
             System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            // loop for star 
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            // loop for printing spaces 
             for(int j=1;j<=nsp;j++){
                System.out.print("  ");
             }
            for(int j=1;j<=nst;j++){
                System.out.print("* "); 
            }
            
            nst--;
            nsp+=2;
            System.out.println();
        }
        
      

        

        sc.close();
    }
}
