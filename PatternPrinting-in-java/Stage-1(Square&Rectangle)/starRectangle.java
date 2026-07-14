
import java.util.Scanner;

public class starRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // writing logic to print the pattern 
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
