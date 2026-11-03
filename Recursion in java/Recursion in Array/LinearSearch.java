
public class LinearSearch {

    public static int linearSearch(int[] arr, int target, int idx) {
        // Base Case 
        if (idx == arr.length) {
            return -1;
        }
        // Recursive Case 
        if (arr[idx] == target) {
            return idx;
        }

        return linearSearch(arr, target, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 2, 3, 1, -5};
        System.out.print(linearSearch(arr, 9, 0));
    }
}
