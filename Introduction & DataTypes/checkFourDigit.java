import java.util.Scanner;

public class checkFourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking integre input from the user 
        System.out.println("Enter the Integer : ");
        int n = sc.nextInt();

        // applying condion to check 4 digit integer or not 
        boolean flag = (n>999 && n<=9999) ? true : false ;

        if(flag ==  true ) System.out.println("Yes");
        else System.out.println("No");
        
        sc.close();
    }
}
