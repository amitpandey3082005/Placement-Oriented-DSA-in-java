import java.util.*;

class Solution {

    private static void findHelper(int arr[], int x, int left, int right, ArrayList<Integer> list) {
        // Base Case
        if (left > right) {
            list.add(-1);
            list.add(-1);
            return;
        }

        if (arr[left] == x && arr[right] == x) {
            list.add(left);
            list.add(right);
            return;
        }

        int nextLeft = (arr[left] != x) ? left + 1 : left;
        int nextRight = (arr[right] != x) ? right - 1 : right;

        findHelper(arr, x, nextLeft, nextRight, list);
    }

    public static ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        findHelper(arr, x, 0, arr.length - 1, list);
        return list;
    }
}

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(Solution.find(arr, 5));
    }
}
