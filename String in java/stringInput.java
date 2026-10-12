
import java.util.*;

public class stringInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String str = sc.nextLine();// it will read the complete string as a input and don't avoid white space 
        System.out.println("Enter new String : ");
        String str1 = sc.next(); // it will avoid whitespace
        System.out.println(str);
        System.out.println(str1);
    }
}
