public class BinarySearch {
     public static int binarySearch(int[] arr, int target, int left, int right) {
          // Writing Base Case
          if (left > right)
               return -1;
          // calculating the mid
          int mid = left + (right - left) / 2;
          // Applying logic to search the element
          if (arr[mid] == target)
               return mid;
          else if (arr[mid] > target)
               return binarySearch(arr, target, left, mid - 1);
          else
               return binarySearch(arr, target, mid + 1, right);
     }

     public static int search(int[] arr, int target) {
          return binarySearch(arr, target, 0, arr.length);
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 6, 7, 8 };
          System.out.print(search(arr, 7));
     }
}
