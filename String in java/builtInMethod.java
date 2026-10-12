
public class builtInMethod {

    public static void main(String[] args) {

        // --- 1. Basic Methods (Length & Inspection) ---
        System.out.println("=== 1. LENGTH & INSPECTION ===");
        String str = "Galgotias";

        // length(): Returns the total number of characters
        System.out.println("Length of '" + str + "': " + str.length()); // Output: 9

        // charAt(index): Returns character at specific position (Starts from 0)
        System.out.println("Character at index 3: " + str.charAt(3)); // Output: g

        // --- 2. Case Conversions & Character Checks ---
        System.out.println("\n=== 2. CASE CONVERSIONS & CHECKS ===");

        // toUpperCase() & toLowerCase()
        System.out.println("Upper Case: " + str.toUpperCase()); // Output: GALGOTIAS
        System.out.println("Lower Case: " + str.toLowerCase()); // Output: galgotias

        // Note: isUpperCase() and isLowerCase() belong to Character class, not String
        char ch1 = str.charAt(0); // 'G'
        char ch2 = str.charAt(1); // 'a'
        System.out.println("Is '" + ch1 + "' UpperCase? " + Character.isUpperCase(ch1)); // Output: true
        System.out.println("Is '" + ch2 + "' LowerCase? " + Character.isLowerCase(ch2)); // Output: true

        // --- 3. Searching & Indexing ---
        System.out.println("\n=== 3. SEARCHING & INDEXING ===");
        String sentence = "Java Full Stack Developer";

        // indexOf(): Gives index of first occurrence of a character/substring
        System.out.println("Index of 'a': " + sentence.indexOf('a')); // Output: 1 (J=0, a=1)
        System.out.println("Index of 'Stack': " + sentence.indexOf("Stack")); // Output: 10

        // lastIndexOf(): Gives index of last occurrence
        System.out.println("Last index of 'a': " + sentence.lastIndexOf('a')); // Output: 3

        // --- 4. Comparison Methods ---
        System.out.println("\n=== 4. COMPARISON METHODS ===");
        String s1 = "amit";
        String s2 = "amit";
        String s3 = "AMIT";
        String s4 = "sumit";

        // equals(): Checks exact content match (case-sensitive)
        System.out.println("s1 equals s2: " + s1.equals(s2)); // Output: true
        System.out.println("s1 equals s3: " + s1.equals(s3)); // Output: false

        // equalsIgnoreCase(): Compares content ignoring upper/lower case differences
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3)); // Output: true

        // compareTo(): Lexicographical (dictionary) comparison. Returns 0 if equal.
        // Returns negative if s1 comes before s4, positive if s1 comes after s4.
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2)); // Output: 0
        System.out.println("s1 compareTo s4: " + s1.compareTo(s4)); // Output: -7 ('a' is 7 steps behind 's')

        // --- 5. Bonus Interview Special Methods (Highly Useful) ---
        System.out.println("\n=== 5. BONUS INTERVIEW SPECIAL METHODS ===");
        String dirtyString = "   Hello Java   ";

        // trim(): Removes leading and trailing spaces (Very useful in Full Stack Form Validations)
        System.out.println("Trimmed String: '" + dirtyString.trim() + "'"); // Output: 'Hello Java'

        // replace(): Replaces old character/sequence with new one
        String baseStr = "Java is fun";
        System.out.println("Replaced String: " + baseStr.replace("fun", "awesome")); // Output: Java is awesome

        // substring(start, end): Extracts a part of string (includes start index, excludes end index)
        String sub = "Welcome";
        System.out.println("Substring (0 to 4): " + sub.substring(0, 4)); // Output: Welc

        // contains(): Checks if a sequence is present inside the string or not
        System.out.println("Does 'Welcome' contain 'come'? " + sub.contains("come")); // Output: true
    }
}
