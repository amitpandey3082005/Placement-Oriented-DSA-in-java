/* Display the given AP uto nth term AP : 2,5,8,11..... upto nth term */
import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        /*Aproch 1 */

        // for(int i=2;i<=3*n-1;i+=34){
        //    System.out.println(i); // we are heavily dependent on i iterator 
        // }

        /* Approch 2 */

        int a = 2 , d = 3; // here a-> first term d-> second term

        for(int i=1;i<=n;i++){
            System.out.println(a);
            a+=d;
        } 

        
        sc.close();
    }
}