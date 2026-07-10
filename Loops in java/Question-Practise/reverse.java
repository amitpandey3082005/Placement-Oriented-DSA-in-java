
import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int ld, rev = 0;
        // while (n > 0) {
        //     ld = n % 10;
        //     rev = rev * 10 + ld;
        //     n /= 10;
        // }

        for(;n>0;){

            ld = n%10;
            rev*=10; // first shift the rev variable the add last digit to it 
            rev+=ld;
            n/=10;

        }

        System.out.println(rev);
        sc.close();
    }
}
