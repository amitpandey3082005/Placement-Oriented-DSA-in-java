
public class firstOccurence {

    public static int firstIndexOccurence(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int idx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                idx = mid;
                right = mid - 1; // check left onward to ensue it is first occurence 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 6, 7};
        System.out.println(firstIndexOccurence(arr, 4));
    }
}
