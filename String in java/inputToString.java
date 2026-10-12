
import java.util.Scanner;

public class inputToString {

    public static void main(String[] args) {
    
     // converting string to integer 
     String str1 = "56546";

     int n1 = Integer.parseInt(str1); // now our string will be in number consideration 
     System.out.println(n1);



        // creating the empty string 
        String str = " ";

        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       // using built in method 
        String s = Integer.toString(n);
        System.out.println(s);
        System.out.println(n + str); // now our 56 will become string 
        double d = 000.006700; //ledaing and triailing zero will ignore 
        System.out.println(("" +d).length()); // 6 and when we use space after d it will count it as length and print 7 as output 
    }
}
