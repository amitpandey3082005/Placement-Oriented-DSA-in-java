import java.util.Scanner;

public class checkAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // storing absolute value of n for negative numbers 
        if(n < 0) n = -n;

        if(n >69) System.out.println(n+" greater than 69");
        else System.out.println(n+" less than 69");

        sc.close();
    }
}
