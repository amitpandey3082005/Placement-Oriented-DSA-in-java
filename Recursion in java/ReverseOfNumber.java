
import java.util.Scanner;

public class ReverseOfNumber {

    // reverse using loop O(Digit) 
    public static int reverseNumber1(int n) {
        int rev = 0;
        while (n > 0) {
            rev *= 10;
            rev += (n % 10);
            n/=10;
        }

        return rev;
    }

    // time Complexcity O(digit) i.e. O(logn with base 10)
    public static int reverseNumber(int n, int r) {
        // Base case
        if (n == 0) {
            return r;
        }
        return reverseNumber(n / 10, r * 10 + n % 10);
    }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Reverse Number is : " + reverseNumber1(n));
        sc.close();
    }
}
