import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of Rectangle :");
        double l = sc.nextInt();
        double b = sc.nextInt();

        double area = l*b; double perimeter = 2*(l+b);

        System.out.println("Area of Rectangle is : "+area + " Perimeter of Rectangle is : "+perimeter);

        boolean result = (area > perimeter); // evalute the expression true or false 
        System.out.println(result);

        sc.close();
    }
}
