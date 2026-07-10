import java.util.Scanner;

public class maximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers ( a, b, c) : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;

        /* 
            Approch - 1 using nested if  else 

       if(a>b){ // b will not be max 
            if(a>c) max = a;
            else max = c;
       }else{ // a is not max among a,b,c i.e b > a
            if(b>c) max = b;
            else max = c; 
       } */
        
        /* 
           Approch - 2 using logical And (&&) 
        */
 
         if( a>=b && a>=c) max = a;
         else if(b>=a && b>=c) max = b;
         else max = c;

         System.out.println(max);

        
        sc.close();
    }
}