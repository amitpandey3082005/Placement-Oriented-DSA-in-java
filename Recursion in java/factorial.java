
import java.util.*;

public class factorial {

    public static int factorial(int n) {
        // Base case 
        if (n <= 1) {
            return 1;
        }

        // recursive case 
        return n * factorial(n - 1); // calling the recursive function on smaler sub problem 
    }

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // calling function to fin Recursion 
        int res = factorial(n);
        System.out.println("Factorial of " + n + " is : " + res);
        sc.close();// closing the scanner object 
    }
}
