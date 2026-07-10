/*  Display the given GP: 1,2,4,8..... upto nth term */
import java.util.Scanner;

public class displayGP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int a = 1, r = 2;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a *= r;
        }

        sc.close();
    }
}
