
import java.util.*;

public class firstAndLastOccurence {

    public static ArrayList<Integer> firstLastOcuurenceIndex(int[] arr, int target) {
        // creating an ArrayList to Store first and last occurence indexes 
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = arr.length - 1;
        int firstOccu = -1, secondOccu = -1;
        while (left <= right) {
            if (arr[left] == target && arr[right] == target) {
                firstOccu = left;
                secondOccu = right;
                break;
            }

            if (arr[left] != target) {
                left++;
            }
            if (arr[right] != target) {
                right--;
            }
        }

        // storing index of first and last occuence 
        list.add(firstOccu);
        list.add(secondOccu);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5};

        System.out.println(firstLastOcuurenceIndex(arr, 2));
    }
}
