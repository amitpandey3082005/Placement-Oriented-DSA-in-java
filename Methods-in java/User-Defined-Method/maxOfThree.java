
import java.util.Scanner;

public class maxOfThree {

    // defining a function  with parameter 
    public static int maximumOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c); // here return statement depicts end of the code stement written after return will become unreachable Statement 
    }

    // defining another function to get MAx 
    public static int Max(int a,int b,int c){
         
         // logic to check max 
         if(a>=b && b>=c) return a;
         else if(b>=a && b>=c) return b;
         else return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(maximumOfThree(a, b, c)); // function call with argument
        int m = maximumOfThree(-7, -8, 9);
        System.out.println(m);
        System.out.println(Max(a, b, c));

        sc.close();
    }
}
