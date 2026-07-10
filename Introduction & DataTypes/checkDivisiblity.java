import java.util.Scanner;

public class checkDivisiblity {
    public static void main(String[] args) {
        // taking positive integer 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Positive Integer : ");
        int n = sc.nextInt();
             
        // checking number divisible or not 
        boolean b = (n%5 == 0)? true : false; // here ternary operator return either true or false 
        System.out.println(b);

        // check number even or odd 
        if( n%2 == 0 )  System.out.println("Even");
        else System.out.println("Odd");

        // In java ternary operator is an expression not an statement so it can not return void 
        //  (n%5==0) ? System.out.println("Yes"); : System.out.println("No"); 

        sc.close();
    }
}
