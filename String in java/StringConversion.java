import java.util.ArrayList;

public class StringConversion {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. Number to String
        // ==========================================
        int number = 12345;
        
        // Convert a primitive integer to a String using String.valueOf() or Integer.toString()
        String numStr1 = String.valueOf(number); 
        String numStr2 = Integer.toString(number); // This achieves the exact same result
        
        System.out.println("1. Number to String: " + numStr1);


        // ==========================================
        // 2. charArray to String
        // ==========================================
        char[] charArray = {'A', 'n', 'r', 'i', 't', 'a'};
        
        // Pass the char array directly into the String constructor to build the text.
        // Note: Do NOT use charArray.toString(), as it returns a memory address hashcode instead of the text.
        String charStr = new String(charArray);
        
        System.out.println("2. Char Array to String: " + charStr);


        // ==========================================
        // 3. StringBuilder to String
        // ==========================================
        StringBuilder sb = new StringBuilder("Amrita");
        sb.setCharAt(1, 'n'); // Modifies the existing characters inside the same builder object
        
        // Convert the mutable StringBuilder instance back into an immutable String object
        String sbStr = sb.toString();
        
        System.out.println("3. StringBuilder to String: " + sbStr);


        // ==========================================
        // 4. ArrayList to String
        // ==========================================
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('n');
        list.add('r');
        list.add('i');
        list.add('t');
        list.add('a');
        
        // Approach A: Direct conversion. This includes the brackets, spaces, and commas in the output string.
        String listDirectStr = list.toString(); // Output format: [A, n, r, i, t, a]
        System.out.println("4a. ArrayList Direct toString(): " + listDirectStr);
        
        // Approach B: Custom conversion. Loop through the list using a StringBuilder to get a clean word.
        StringBuilder listBuilder = new StringBuilder();
        for (char ch : list) {
            listBuilder.append(ch); // Appends each character one by one
        }
        String listProperStr = listBuilder.toString(); // Output format: Anrita
        
        System.out.println("4b. ArrayList to Proper String: " + listProperStr);
    }
}
