public class MergeTwoSortedArray {
    public static int[] merge(int[] arr1, int[] arr2, int[] res) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                res[k++] = arr2[j++];
            } else {
                res[k++] = arr1[i++];
            }
        }
        // when array 1 is gretaer
        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }
        // when array 2 is greater
        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40 };
        int[] arr2 = { -3, 15, 20, 50 };
        int[] res = new int[arr1.length + arr2.length];
        int[] ans = merge(arr1, arr2, res);
        // printing sorted Array
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}