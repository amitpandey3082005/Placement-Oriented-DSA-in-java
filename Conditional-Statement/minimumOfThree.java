import java.util.Scanner;

public class minimumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers ( a,b,c) :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = 0 ;

        /*  
             Approch - 1 using logical And (&&) 
             
            if(a<=b && a<=c) min = a;
            else if (b<=a && b<=c) min = b;
            else   min = c;
        */

       /* Approch - 2 using nested if  */
        if (a < b) { 
             if (a < c)    min = a;
             else  min = c;
        }
         else {  
              if (b < c)   min = b; 
               else     min = c;
         }
        // printing the minimum value 
        System.out.println(min);
     
        sc.close();
    }
}