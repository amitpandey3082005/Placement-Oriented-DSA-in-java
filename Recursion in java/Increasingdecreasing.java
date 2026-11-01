
import java.util.*;

public class Increasingdecreasing {

    public static void decreasingIncreasing(int n) {
        // Adding Base Case 
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        decreasingIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        // taking n as user input 
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // decreasing incresing function call 
        decreasingIncreasing(n);

        sc.close();

    }
}
