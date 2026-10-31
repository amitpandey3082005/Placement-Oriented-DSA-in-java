
import java.util.*;

public class Pascal {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // 1. Normal Double Space (Do baar space baar dabayein)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            long currentElement = 1;

            for (int j = 1; j <= i; j++) {
                // 2. Normal output ke sath do spaces append kijiye
                // Yeh double digit numbers ko adjust karne ke liye kafi hai
                System.out.print(currentElement + "   ");

                currentElement = currentElement * (i - j) / j;
            }

            System.out.println();
        }
        sc.close();
    }
}
