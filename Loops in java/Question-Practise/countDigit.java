import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();

        // writing logic to count number of  digit in number  
        int countDigit = 0;

        while(n>0){
         n/=10;
         countDigit++;
        }

        System.out.println("Number of Digit is "+countDigit);
        
        sc.close();
    }
}