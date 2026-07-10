/*Program toh print prime numbers series within a given range  */
import java.util.Scanner;

public class printPrimeWithinRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range [a,b] :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
