import java.util.Scanner;

public class checkTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int a, b, c;

      System.out.println("Enter Sides of Triagle :");

       a = sc.nextInt();
       b = sc.nextInt();
       c = sc.nextInt(); 

       // using logical And && to check these sides forms triangle or not 

       if( (a+b > c) && (b+c > a) && (c+a > b))  System.out.println("Yes ");
       else System.out.println("No ");

       // closing the scanner class object 
       sc.close();
    }
}