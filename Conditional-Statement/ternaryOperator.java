/*  Trying to find the max of three using ternary operator 
    *   Teranry operator acts as a expression which always return certain values never return void like statement 
*/
import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Numbers (a,b,c): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Now we will try to implement nested ternary operator to find the max of three numbers 
         
        int max = (a>b)? a: b; // evaluate max of 2 among a and b 
        System.out.println(max); 

        int max1 = (a>b)? ( (a>c)? a : c ):((b>c)? b : c);
        System.out.println(max1);
        
        sc.close();
    }
}