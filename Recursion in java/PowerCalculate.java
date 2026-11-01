
import java.util.*;

public class PowerCalculate {

    // time complexcity O(b)
    public static int calculatePower(int a, int b) {
        // base case 
        if (b == 1) {
            return a;
        }

        // recursive case 
        return a * calculatePower(a, b - 1);
    }

    // time complexcity O(logb)
    public static int calculatePower1(int a, int b) {
        // base case 
        if (b == 1) {
            return a;
        }

        if (b % 2 == 0) {
            int res = calculatePower1(a, b / 2);
            return res * res;
        } else {
            int res = calculatePower1(a, b / 2);
            return a * res * res;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter base and exponent: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = calculatePower1(a, b);
        System.out.print("Power of a^b is " + res);
        sc.close();
    }
}
