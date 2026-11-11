// Class to handle fraction arithmetic operations
class FractionArithmetic { 
    // Data members to store numerator and denominator
    int num; 
    int deno; 

    // Default constructor - used to create empty objects
    FractionArithmetic() { } 

    // Parameterized constructor - used to initialize a fraction with values
    FractionArithmetic(int num, int deno) { 
        this.num = num; 
        this.deno = deno; 
    } 

    // Method to add two fractions and return the result as a new fraction object
    FractionArithmetic add(FractionArithmetic f1, FractionArithmetic f2) { 
        // Creating a result object using the default constructor
        FractionArithmetic res = new FractionArithmetic(); 
        
        // Calculating the new numerator using cross-multiplication [Parentheses corrected]
        res.num = ((f1.num * f2.deno) + (f2.num * f1.deno)); 
        
        // Calculating the new denominator
        res.deno = (f1.deno * f2.deno); 
        
        // Calling the simplify function to reduce the fraction to its lowest terms
        simplify(res); 
        
        // Returning the final simplified result
        return res; 
    } 

    // Method to substract 
    FractionArithmetic sub(FractionArithmetic f1, FractionArithmetic f2) { 
        // Creating a result object using the default constructor
        FractionArithmetic res = new FractionArithmetic(); 
        
        // Calculating the new numerator using cross-multiplication [Parentheses corrected]
        res.num = ((f1.num * f2.deno) - (f2.num * f1.deno)); 
        
        // Calculating the new denominator
        res.deno = (f1.deno * f2.deno); 
        
        // Calling the simplify function to reduce the fraction to its lowest terms
        simplify(res); 
        
        // Returning the final simplified result
        return res; 
    } 
    
    // method to multiply 
    FractionArithmetic mul(FractionArithmetic f1, FractionArithmetic f2) { 
        // Creating a result object using the default constructor
        FractionArithmetic res = new FractionArithmetic(); 
        
        // Calculating the new numerator using cross-multiplication [Parentheses corrected]
        res.num = (f1.num*f2.num); 
        
        // Calculating the new denominator
        res.deno = (f1.deno * f2.deno); 
        
        // Calling the simplify function to reduce the fraction to its lowest terms
        simplify(res); 
        
        // Returning the final simplified result
        return res; 
    } 

    // function to divide 
    FractionArithmetic div(FractionArithmetic f1, FractionArithmetic f2) { 
        // Creating a result object using the default constructor
        FractionArithmetic res = new FractionArithmetic(); 
        
        // Calculating the new numerator using cross-multiplication [Parentheses corrected]
        res.num = (f1.num*f2.deno); 
        
        // Calculating the new denominator
        res.deno = (f1.deno * f2.num); 
        
        // Calling the simplify function to reduce the fraction to its lowest terms
        simplify(res); 
        
        // Returning the final simplified result
        return res; 
    } 
  
    // Method to display the fraction in "num/deno" format
    void display() { 
        System.out.println(num + "/" + deno); 
    } 

    // Function to simplify the fraction by reducing it to lowest terms
    void simplify(FractionArithmetic f) { 
        // Handling the negative case: Checks if the fraction is overall negative
        boolean isNegative = (f.num * f.deno < 0) ? true : false; 
        
        // Converting numerator to absolute (positive) value for GCD calculation
        f.num = Math.abs(f.num); 
        
        // Converting denominator to absolute (positive) value
        f.deno = Math.abs(f.deno); 
        
        // Finding the Highest Common Factor (HCF/GCD) of numerator and denominator
        int hcf = gcd(f.num, f.deno); 
        
        // Dividing numerator by HCF to reduce it
        f.num = f.num / hcf; 
        
        // Dividing denominator by HCF to reduce it
        f.deno = f.deno / hcf; 
        
        // If the original fraction was negative, re-apply the minus sign to the numerator [Syntax corrected]
        if (isNegative) f.num = -f.num; 
    } 

    // Recursive function to calculate GCD using Euclid's Algorithm
    int gcd(int a, int b) { 
        if (b == 0) return a; 
        return gcd(b, a % b); 
    } 
} 

// Main class to execute the program
public class Fraction { 
    public static void main(String[] args) { 
        // Initializing the first fraction: 2/3
        FractionArithmetic f1 = new FractionArithmetic(2, 3); 
        
        // Initializing the second fraction: 3/2
        FractionArithmetic f2 = new FractionArithmetic(3, 2); 
        
        // Calling the add method via f1 object to add f1 and f2
        FractionArithmetic multiply = f1.mul(f1, f2); 
        
        // Displaying the final result (Expected Output: 13/6)
        multiply.display(); 
    } 
}
