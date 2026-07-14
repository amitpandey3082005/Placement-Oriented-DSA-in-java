import java.util.Scanner;

public class alphabetSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print((char)(i+'A')+" ");
            }
            System.out.println(); // for new line 
        }
        
        sc.close();
    }
}