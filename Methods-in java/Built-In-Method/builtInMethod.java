import java.util.Scanner; 

public class builtInMethod { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        // --- Java Math Class Methods ---

        // Returns the square root of given number (Output: 2.0)
        System.out.println(Math.sqrt(4)); 

        // Returns the cube root of given number (Output: 5.0)
        System.out.println(Math.cbrt(125)); 

        // Calculates base to the power of exponent (3^2 = 9.0)
        // Exception: Returns 1.0 if both base and power are 0
        System.out.println(Math.pow(3, 2)); 

        // Returns the greater value between two numbers (Output: 4)
        System.out.println(Math.max(3,4)); 

        // Returns the smaller value between two numbers (Output: 5)
        System.out.println(Math.min(5,6)); 

        // Rounds down to the nearest mathematical integer (Output: -9.0)
        System.out.println(Math.floor(-8.7));  // floor returns the gif(greatest integer function ) value 

        // Rounds up to the nearest mathematical integer (Output: 9.0)
        System.out.println(Math.ceil(8.7)); 

        sc.close(); 
    } 
}
