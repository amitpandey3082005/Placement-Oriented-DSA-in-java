
import java.util.Arrays;
import java.util.Scanner;

public class twoSum {

    // Approch -1 O(nlogn)
    public static void targetSum(int[] arr, int target) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int currsum = arr[i] + arr[j];
            if (currsum == target) {
                System.out.print("[" + arr[i] + " " + arr[j] + "]");
                i++;
                j--;
            } else if (currsum < target) {
                i++;
            } else {
                j--;
            }
        }
    }

    // Approch - 2 O(n^2)
    public static void targetSum2(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currsum = arr[i] + arr[j];
                if (currsum == target) {
                    System.out.print("[" + arr[i] + "," + arr[j] + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3, 5, -1, -3};
        Arrays.sort(arr);
        int target = 2;
        targetSum2(arr, target);
        sc.close();
    }
}
