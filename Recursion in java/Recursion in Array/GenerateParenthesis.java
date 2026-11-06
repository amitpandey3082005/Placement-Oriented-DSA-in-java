import java.util.*;

class Solution {
    public static void generate(List<String> ans, String s, int left, int right, int n) {
        // Base Case
        if (right == n) {
            ans.add(s);
            return;
        }
        // Recursive Case
        if (left < n)
            generate(ans, s + '(', left + 1, right, n);
        if (right < left)
            generate(ans, s + ')', left, right + 1, n);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans, "", 0, 0, n);
        return ans;
    }
}

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(new Solution().generateParenthesis(n));
    }
}
