import java.util.Scanner;

public class checkRealNumberIntegerOrNot {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a real Number : ");
        double n = sc.nextDouble();

        // logic to check integer or not 

        if(n == (int) n) System.out.println("Yes , this real number is also a integer"); 
        else System.out.println("No , It is not a Integer ");

        // Approch 2 
        if(n%1 ==0) System.out.print("Yes , It is integer");
        else System.out.print("No , It is not Integer");

        sc.close();
    }
}
