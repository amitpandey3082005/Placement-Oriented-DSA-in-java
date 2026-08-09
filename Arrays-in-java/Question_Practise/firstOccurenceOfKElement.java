import java.util.*;

public class firstOccurenceOfKElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 7, 8};
        int k = 4;
        int result = -1;
        
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // overflow se bachata hai
            
            if (arr[mid] == k) {
                 result = mid;
                right = mid - 1; 
            } else if (arr[mid] < k) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        System.out.println(result); 
    }
}
