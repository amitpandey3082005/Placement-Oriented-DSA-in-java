
import java.util.Scanner;

public class permutation {

    // defining a function to calculate factorial 
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // defining function to calculate Combination 
    public static int Combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // defining function to calculate permutation 
    public static int Permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n and r :");
        int n = sc.nextInt();
        int r = sc.nextInt();

        if (r <= n) {
            System.out.println(Permutation(n, r)); // print permutation of n,r
            System.out.println(Combination(n, r)); // print combination of n,r
        } else {
            System.out.println("Invalid r ! ");
        }

        sc.close();
    }
}
