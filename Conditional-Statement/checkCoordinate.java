import java.util.Scanner;

public class checkCoordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter x and y coordinate ( x, y ) :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // logic to check coordinated using if else 

        if( x == 0 && y == 0)          System.out.println("At origin");
        else if ( x == 0 && y != 0 )   System.out.println("At y axis ");
        else if ( x != 0 && y == 0 )   System.out.println("At x axis ");
        else if (x > 0 && y > 0)       System.out.println("At First Quadrant");
        else if(x < 0 && y > 0)        System.out.println("At Second Quadrant");
        else if (x < 0 && y < 0)       System.out.println("At Third Quadrant");
        else if (x > 0 && y < 0)       System.out.println("At Fourth Quadrant");
        
        sc.close();
    }
}