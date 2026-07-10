
import java.util.Scanner;

public class sumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number n:");
        int n = sc.nextInt();

        int sum = 0, rem;
        // using for loop 
        // while(n>0){
        //     rem = n%10;
        //     sum+=rem;
        //     n/=10;
        // }

        // using for loop 
        // for(;n>0;){
        //     rem = n%10;
        //     sum+=rem;
        //     n/=10;
        // }
// using do while loop
        do {
            rem = n % 10;
            sum += rem;
            n /= 10;
        } while (n > 0);

        System.out.println(sum);

        sc.close();
    }
}
