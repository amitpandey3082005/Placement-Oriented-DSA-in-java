
public class CompressString {

    public static String compressString(String s) {
        // creating string builder 
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {

            char ch = Character.toLowerCase(s.charAt(i));
            char ch1 = Character.toLowerCase(s.charAt(j));

            if (ch == ch1) {
                j++; // expand window 
            } else {
                int freq = j - i;
                ans.append(ch);
                ans.append(freq);
                i = j; // ensure i and j should be equal when only charecter is different 
            }

        }
        // calculation for last charecter 
        if (i < s.length()) {

            int freq = j - i;
            char ch = Character.toLowerCase(s.charAt(i));
            ans.append(ch);
            ans.append(freq);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressString("aaabbbCccc"));
    }
}
