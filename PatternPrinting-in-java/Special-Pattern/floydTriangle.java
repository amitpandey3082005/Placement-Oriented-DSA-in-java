import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();

       // ceating print variable 
       int a =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print(a++ +" ");
            }
            System.out.println(); // Adding next line after each row 
        }
        
        sc.close();
    }
}