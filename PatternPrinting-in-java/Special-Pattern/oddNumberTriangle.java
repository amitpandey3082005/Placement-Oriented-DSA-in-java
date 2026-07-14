import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();

        

        for(int i=1;i<=n;i++){
            int a=1; // set a with 1 for each row 
            for(int j=1;j<=i;j++){
              System.out.print(a+" ");
              a+=2; // incrementing variable a by 2 to print only odd number 
            }
            System.out.println(); // Adding next line after each row 
        }
        
        sc.close();
    }
}