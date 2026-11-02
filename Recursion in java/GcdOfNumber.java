
import java.util.*;

public class GcdOfNumber {

    // writing function to return gcd of two number using recursion 
    // time complexcity will be O(min(a,b))
    public static int gcd(int a, int b) {
        // Base case 
        if (b == 0) {
            return a; // because gcd of (a,0) always be a 
        }
        // recursive case 
        return gcd(b, a % b);
    }

    // time complexcity O(log(min(a,b)))
    public static int gcd1(int a, int b) {
        // logic 1 for HCF 
        int hcf = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        // logic 2 for HCF where a is HCF 
        // while (b != 0) {
        //     int remainder = a % b;
        //     a = b;
        //     b = remainder;
        // }
        return hcf;
    }

    public static void main(String[] args) {
        // taking numbers input 
        System.out.println("Enter a and b : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD(a,b) is : " + gcd1(a, b));
        sc.close();
    }
}
