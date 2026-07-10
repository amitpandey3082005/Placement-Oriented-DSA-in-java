import java.util.Scanner;

public class printOddDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // itreation up to 50 
        for(int i=1;i<=100;i+=2){
             if(i%3==0) System.out.print(i+" ");
        }
        
        sc.close();
    }
}