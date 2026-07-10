import java.util.Scanner;

public class sumOfNumberAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        // writing logic to get reverse number 
        int lastDigit=0,reverseNum=0,originalNumber=n;

        while (n>0) { 
            lastDigit = n%10;
            reverseNum*=10; 
            reverseNum+=lastDigit;
            n/=10; // due to this to extrct reverse we hve lost the original number so before extracting this we will store original number in a new seprate variable
        }

        int sum = originalNumber+reverseNum;

        System.out.println("Sum of Number and its Reverse is : "+sum);

    
        
        sc.close();
    }
}