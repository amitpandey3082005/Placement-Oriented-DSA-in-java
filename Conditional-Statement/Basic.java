import java.util.Scanner;

public class Basic{

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          // taking number as input 
          System.out.println("Enter the number :");
          int n = sc.nextInt();

          boolean a = n%5==0;
          boolean b = n%3 ==0;
              
          /* Approch - 1 
          if(n%5 == 0 && n%3==0){
             System.out.println("Apurva");
          }else if(n%5 == 0){ // if this condition check means number is already not divisible by both 
              System.out.println("Riya");
          }else if(n%3 == 0){
               System.out.println("Banu");
          }else{
            System.out.println("Isha");
          }  */


        // Approch - 2
          if(a && b){
             System.out.println("Apurva");
          }else if(a){ // if this condition check means number is already not divisible by both 
              System.out.println("Riya");
          }else if(b){
               System.out.println("Banu");
          }else{
            System.out.println("Isha");
          }   
          
          sc.close();
    }
}