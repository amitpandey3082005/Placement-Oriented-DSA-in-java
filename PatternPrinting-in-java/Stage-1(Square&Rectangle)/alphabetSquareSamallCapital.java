import java.util.Scanner;

public class alphabetSquareSamallCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = sc.nextInt();


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i%2==0) System.out.print((char)(i+'a')+" ");
               else System.out.print((char)(i+'A')+" ");
            }
            System.out.println();// Adding new line after each row 
        }
        
        sc.close();
    }
}