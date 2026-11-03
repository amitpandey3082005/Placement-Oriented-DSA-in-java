class Solution {
    public static int firstOccurence(int[] arr, int target, int left, int right, int idx) {

        if (left > right)
            return idx;

        int mid = left + (right - left) / 2;

        // Recursive case
        if (arr[mid] == target) {
            idx = mid;
            return firstOccurence(arr, target, left, mid - 1, idx);
        } else if (arr[mid] > target) {
            return firstOccurence(arr, target, left, mid - 1, idx);
        } else {
            return firstOccurence(arr, target, mid + 1, right, idx);
        }
    }

    public static int firstSearch(int[] arr, int k) {
        return firstOccurence(arr, k, 0, arr.length - 1, -1);
    }
}

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 9, 10 };
        int res = Solution.firstSearch(arr, 9);
        System.out.println(res); // printig the idx where element is present
    }

}
