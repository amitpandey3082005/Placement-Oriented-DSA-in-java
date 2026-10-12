
import java.util.*;

public class MaxCharOccurence {

    // finding max char using sorting and sliding window O(nlogn) --> time complexcity 
    public static char getMaxOccuringChar(String s) {

        // converting string to array 
        char[] str = s.toCharArray();
        Arrays.sort(str); // sort array 

        // write the siding window logic on sorted array 
        int i = 0, j = 0, maxFreq = Integer.MIN_VALUE;
        char maxchar = str[0];

        while (i < str.length && j < str.length) {
            if (str[i] == str[j]) {
                j++;// if element same expand Window 
            } else {
                int currfreq = j - i; // when element are different calculate size of window 
                if (currfreq > maxFreq) {
                    maxFreq = currfreq;
                    maxchar = str[i];
                }
                i = j;// now bring both pointer at the same index 
            }
        }

        // when the last element will be max char the 
        int currfreq = j - i; // when element are different calculate size of window 
        if (currfreq > maxFreq) {
            maxFreq = currfreq;
            maxchar = str[str.length - 1];
        }

        return maxchar;
    }

    // finding maxchar with frequency Array O(n) -- > time Complexcity 
    public static char getMaxOccuringChar1(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) (ch - 97);
            freq[idx]++; // increase the frequency 
        }
        int maxFreq = Integer.MIN_VALUE;
        char maxchar = s.charAt(0); // consider first char as max char 
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxchar = (char) (i + 97);
            }
        }
        return maxchar;
    }

    public static void main(String[] args) {

    }
}
