// string has implementation as character array 

public class stringPalindrome {

    public static void main(String[] args) {
        String str = "malayalam";

        int i = 0, j = str.length() - 1;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }

        System.out.println("Palindrome");
    }
}
