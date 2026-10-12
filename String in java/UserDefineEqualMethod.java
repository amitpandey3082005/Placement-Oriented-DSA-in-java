
public class UserDefineEqualMethod {

    public static boolean checkEquals(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // two new String created 
        String s = "Amit";
        String str1 = new String("Amit");

        // Comparing these two string 
        System.out.println(s.equals(str1)); // true return 
        System.out.println(checkEquals(s,str1)); // true
        System.out.println(s == str1); // print false because it checks charecter by charecter nt Complete String and return equal or not 
    }
}
