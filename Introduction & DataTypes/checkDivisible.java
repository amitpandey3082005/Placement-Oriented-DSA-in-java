import java.util.Scanner;

public class checkDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

      // logic to check number divisible by 5 or 3 

      if( (n%5 == 0) || (n%3 == 0)) System.out.println("Yes");
      else System.out.println("No");

        sc.close();
    }
}
