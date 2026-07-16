import java.util.Scanner;

public class printAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number:");
        double a = sc.nextInt();

        System.out.println(Math.abs(a));
        
        sc.close();
    }
}