import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // i== j --> left Diagonal 
                //i+j=n-1 ---> right Diagonal 
                  if(i==j ||(i+j)==(n-1)) {System.out.print("* "); }
                  else System.out.print("  ");
            }
            System.out.println(); // Adding new lines 
        }
        
        sc.close();
    }
}