
public class countVowel {

    public static void main(String[] args) {
        String str = "amit";// consider all value in string is in lower case 
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println("No of vowels are : " + count);
    }
}
