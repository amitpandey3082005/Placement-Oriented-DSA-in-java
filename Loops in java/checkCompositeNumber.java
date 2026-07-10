/* Check the entered number is composite or not  */
import java.util.Scanner;

public class checkCompositeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number (n)");
        int n = sc.nextInt();

        // creating a flag variable 
        boolean isComposite = true;
        if (n <= 1) {
            System.out.println("Neither Prime nor Composite");
        } else if (n <= 3) {
            isComposite = false;
        } else {
            // writing logic to check number composite or not 
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isComposite=true;
                    break;
                }
            }
        }

        if(isComposite) System.out.println("Composite");
        else System.out.println("Prime");

        sc.close();
    }
}
