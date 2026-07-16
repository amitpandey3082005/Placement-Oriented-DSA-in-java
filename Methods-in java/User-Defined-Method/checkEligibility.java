
import java.util.Scanner;

public class checkEligibility {

    // defining a function to check eligibility of voter 
    public static String checkVoteOrNot(int age) {
        return (age >= 18) ? "Eligible" : "Not Eligible"; // ternary operator to check eligible or not 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println(checkVoteOrNot(age));// function call with argument 

        sc.close();
    }
}
