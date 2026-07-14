import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
               System.out.print((char)(j+'A')+" "); // using type casting 
            }
            System.out.println();
        }
        
        sc.close();
    }
}