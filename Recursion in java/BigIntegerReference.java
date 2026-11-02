
import java.math.BigInteger; // 1. Always import this package first

public class BigIntegerReference {

    public static void main(String[] args) {

        System.out.println("=== 1. INITIALIZATION (How to create BigInteger objects) ===");

        // Using built-in constants for standard numbers (0, 1, 10)
        BigInteger zero = BigInteger.ZERO; // Value: 0
        BigInteger one = BigInteger.ONE;  // Value: 1
        BigInteger ten = BigInteger.TEN;  // Value: 10

        // IMPORTANT: Converting standard primitive numbers (int/long) to BigInteger
        BigInteger numA = BigInteger.valueOf(25);
        BigInteger numB = BigInteger.valueOf(4);

        // Creating extremely massive numbers using Strings (Prevents compilation errors for huge digits)
        BigInteger largeNum1 = new BigInteger("987654321098765432109876543210");
        BigInteger largeNum2 = new BigInteger("123456789012345678901234567890");

        System.out.println("numA: " + numA);
        System.out.println("numB: " + numB);
        System.out.println("Large Number 1: " + largeNum1);
        System.out.println();

        System.out.println("=== 2. ARITHMETIC OPERATIONS (Basic Math) ===");

        // ADDITION: equivalent to (numA + numB)
        BigInteger sum = numA.add(numB);
        System.out.println("Addition (25 + 4): " + sum); // Output: 29

        // SUBTRACTION: equivalent to (numA - numB)
        BigInteger diff = numA.subtract(numB);
        System.out.println("Subtraction (25 - 4): " + diff); // Output: 21

        // MULTIPLICATION: equivalent to (numA * numB)
        BigInteger prod = numA.multiply(numB);
        System.out.println("Multiplication (25 * 4): " + prod); // Output: 100

        // DIVISION: equivalent to (numA / numB) -> returns absolute quotient without decimals
        BigInteger div = numA.divide(numB);
        System.out.println("Division Quotient (25 / 4): " + div); // Output: 6

        // MODULO/REMAINDER: equivalent to (numA % numB) -> heavily used to extract digits
        BigInteger rem = numA.mod(numB);
        System.out.println("Modulo Remainder (25 % 4): " + rem); // Output: 1

        // POWER / EXPONENT: equivalent to (numB ^ 3)
        // NOTE: The exponent parameter inside pow() must always be a standard primitive int
        BigInteger power = numB.pow(3);
        System.out.println("Power Exponentiation (4^3): " + power); // Output: 64
        System.out.println();

        System.out.println("=== 3. COMPARISON & CONDITIONAL CHECKS ===");

        // EQUALS CHECK: equivalent to (numA == numB) -> returns boolean (true/false)
        if (numA.equals(numB)) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Numbers are NOT equal (25 != 4)");
        }

        // MAGNITUDE COMPARISON: equivalent to (<, >, <=, >=)
        // A.compareTo(B) returns:
        //  1  -> if A is greater than B  (A > B)
        // -1  -> if A is less than B     (A < B)
        //  0  -> if A is equal to B      (A == B)
        int compareResult = numA.compareTo(numB);
        if (compareResult > 0) {
            System.out.println("numA is GREATER than numB (25 > 4)");
        } else if (compareResult < 0) {
            System.out.println("numA is LESS than numB");
        }
        System.out.println();

        System.out.println("=== 4. DOWNCASTING CONVERSION (BigInteger to Primitive int/long) ===");

        BigInteger smallBigInt = BigInteger.valueOf(789);

        // Converting BigInteger back to standard int (Crucial for storing in ArrayList<Integer>)
        int normalInt = smallBigInt.intValue();

        // Converting BigInteger back to standard long
        long normalLong = smallBigInt.longValue();

        System.out.println("Converted to primitive int: " + normalInt);
        System.out.println("Converted to primitive long: " + normalLong);
    }
}
