/* Display Each Alphabet with their corresponding ASCII Value  */
import java.util.Scanner;

public class printAlphabetAndASCII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approch 1   (using explicit typecasting )
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i + " " + i);
        }

        // Approch 2  using implicit Typecasting 
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " " + (c + 0));
        }

        sc.close();
    }
}
