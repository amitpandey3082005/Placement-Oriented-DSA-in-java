import java.util.Arrays;
import java.util.Scanner;

/**
 * ============================================================================
 * WORKING NOTES: JAVA MEMORY MANAGEMENT (PASS-BY-VALUE vs REFERENCE & COPIES)
 * ============================================================================
 
 */
public class shallowCopyDeepCopy {

    /**
     * DEMO 1: PASS-BY-VALUE (For Primitives)
     * --------------------------------------
     * Java primitives (int, float, etc.) follow strict 'Pass-by-Value'.
     * When this method is called, a completely separate copy of the variable
     * is created inside the Stack memory area for this method.
     */
    public static void square(int x) {
        x *= x; // Modifying the copy inside the local stack frame of square()
        System.out.println("Inside square() method: " + x); // Prints squared value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
         * ====================================================================
         * APPROACH 1: PRIMITIVE VARIABLES (Pass-By-Value Concept)
         * ====================================================================
         * LOGIC: 'x' inside main() and 'x' inside square() are completely 
         * independent. Modifying 'x' inside the method will NOT alter the original
         * value of 'x' in the main method.
         */
        int x = 20;
        System.out.print("Original x before method: ");
        System.out.println(x); // Output: 20
        
        square(x); // Passing a COPY of the value 20 to the method
        
        System.out.print("Original x after method: ");
        System.out.println(x); // Output: 20 (Unchanged due to Pass-By-Value)
        System.out.println("------------------------------------------------");


        /* 
         * ====================================================================
         * APPROACH 2: ARRAYS & REFERENCES (Pass-By-Reference Visual Behavior)
         * ====================================================================
         * IMPORTANT: Java is ALWAYS Pass-by-Value. However, for objects/arrays,
         * the "value" passed is the reference (Memory Address) of the object.
         * Therefore, it behaves like Pass-by-Reference in daily terms.
         */

        // Base Array Definition
        int[] arr = {2, 3, 4};

        /*
         * CASE 1: SHALLOW COPY (Reference Copy)
         * -------------------------------------
         * LOGIC: 'arr1' does NOT create a new array in memory. It just stores the
         * exact same memory address (pointing to the 0th index) in the Heap.
         * 
         * MEMORY MAP: [arr] ---> (Heap Address: 0x111) <--- [arr1]
         * 
         * CONSEQUENCE: Any change made via 'arr1' directly modifies 'arr'. 
         * The same thing happens when an array is passed into a Java method.
         */
        int[] arr1 = arr; 
        
        arr1[0] = 99; // Changing the first element using the shallow copy reference
        System.out.println("CASE 1 (Shallow Copy Check):");
        System.out.println("Original arr[0]: " + arr[0]);   // Output: 99
        System.out.println("Shallow  arr1[0]: " + arr1[0]); // Output: 99
        System.out.println("------------------------------------------------");


        /*
         * CASE 2: DEEP COPY (Independent Object Creation)
         * -----------------------------------------------
         * LOGIC: Arrays.copyOf() allocates a brand-new chunk of memory in the Heap,
         * then reads and clones every individual value into this new space.
         * 
         * MEMORY MAP: [arr]  ---> (Heap Address: 0x111 ->)
         *             [arr2] ---> (Heap Address: 0x222 ->)
         * 
         * CONSEQUENCE: 'arr2' is fully independent. Modifying 'arr2' will NEVER
         * affect the original 'arr'. This mimics the isolated safety of pass-by-value.
         */
        int[] arr2 = Arrays.copyOf(arr, arr.length); 
        int[] brr = new int[arr.length]; // here if we use for loop it will also be a deep copy not shallow copy 
        
        arr2[0] = 555; // Changing the first element of the deep copy
        System.out.println("CASE 2 (Deep Copy Check):");
        System.out.println("Original arr[0]: " + arr[0]);  // Output: 99 (Safe/No change)
        System.out.println("Deep     arr2[0]: " + arr2[0]); // Output: 555 (Isolated change)
        System.out.println("------------------------------------------------");

        // Closing the resources properly to avoid memory leaks
        sc.close();
    }
}