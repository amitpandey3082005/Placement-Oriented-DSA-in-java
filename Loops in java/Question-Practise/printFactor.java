
import java.util.Scanner;

public class printFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        // writing logic to printing all factor 
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == (n / i)) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i + " " + (n / i)+" ");
                }
            }
        }

        sc.close();
    }
}
