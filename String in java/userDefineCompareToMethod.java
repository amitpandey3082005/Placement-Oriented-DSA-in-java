
public class userDefineCompareToMethod {

public static int CompareTo(String str1, String str2) {
    int i = 0, j = 0;

    while (i < str1.length() && j < str2.length()) {
        if (str1.charAt(i) != str2.charAt(j)) {
            return str1.charAt(i) - str2.charAt(j); 
        }
        i++; // Move to next character of str1
        j++; // Move to next character of str2
    }

    // Agar saare matching chars khatam ho gaye, toh lengths ka difference do
    return str1.length() - str2.length();
}

    public static void main(String[] args) {
        String str1 = "Harshit";
        String str2 = "Harshit";

        System.out.println(CompareTo(str1, str2));
    }
}
