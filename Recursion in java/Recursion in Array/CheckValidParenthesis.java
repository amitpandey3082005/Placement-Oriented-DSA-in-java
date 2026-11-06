import java.util.*;

class Solution {
    public boolean isBalanced(String s) {
        // Creating the Stack of Character type
        Stack<Character> stack = new Stack<>();

        // Loop to iterate each character of the String
        for (int i = 0; i < s.length(); i++) {
            // Read the current character of the String
            char ch = s.charAt(i);

            // If there is an open bracket then insert into the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // Check if stack is empty (means closing bracket came without an opening
                // bracket)
                if (stack.isEmpty()) {
                    return false;
                }

                // Reading the top character of the stack
                char top = stack.peek();

                // FIX: Checking if the incoming closing bracket 'ch' matches the open bracket
                // 'top'
                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                    stack.pop(); // Match found, so remove from stack
                } else {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // If stack is empty, return true
    }
}

public class CheckValidParenthesis {
    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(new Solution().isBalanced(s));
    }
}
