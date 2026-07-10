import java.util.Scanner;

public class evenInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // printing all even numbers with [1,10]

        for(int i=1;i<=10;i++){
          if(i%2==0) System.out.print(i+" ");  // unnecessarily we are iterating to check 10 times 
        }  System.out.println(); // for next 

        // print all even numbers within range 
        for(int i=2;i<=10;i+=2){
           System.out.print(i+" "); // it will be more optimized logic with 5  itetration 
        } System.out.println(); // for next line 

        // print all odd numbers within range 
        for(int i=1;i<=10;i+=2){
            System.out.print(i+" "); // it will be more optimized logic with 5  itetration
        }
        
        sc.close();
    }
}