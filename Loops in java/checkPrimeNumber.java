import java.util.Scanner;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (N) : ");
        int n = sc.nextInt();
        
        // Logic to check prime
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }
        else if(n<=3){
            isPrime = true; // 2 and 3 are prime 
        } 
        else if(n%2==0 || n%3==0){
            isPrime = false; // ignoring all 2 and 3 multiple 
        }else { // since all prime number can be set as 6k+1 form 
            for (int i = 5; i * i <= n; i+=6) {
                // i checks 6k-1 (i.e. 5,11,17... etc)
                // i+2 checks 6k+1 (i.e 7,13,19.... etc )
                if (n % i == 0 && n%(i+2)==0) {
                    isPrime = false;
                    break; 
                }
            }
        }
        if (isPrime) System.out.println("Prime"); 
        else  System.out.println("Not Prime");
        
        sc.close();
    }
}
