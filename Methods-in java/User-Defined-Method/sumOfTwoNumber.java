
import java.util.Scanner;

public class sumOfTwoNumber {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sum(a, b)); // function call with argument 

        sc.close();
    }
}
