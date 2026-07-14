import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            // printing spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // printing stars 
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(); // Adding new line after each row 
        }
        
        sc.close();
    }
}