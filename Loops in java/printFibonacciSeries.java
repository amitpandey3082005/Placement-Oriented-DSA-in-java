/* Program to print fibonacci series upto n terms  */
import java.util.Scanner;

public class printFibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Nth term (n): ");
        int n = sc.nextInt();

        int a1 = 0, b2 = 1;
       
        for (int i = 1; i <= n; i++) {
            System.out.print(a1 + " ");
            int c = a1 + b2; // compute next term 

            // shift variable 
            a1 = b2;
            b2 = c;
        }

        sc.close();
    }
}
