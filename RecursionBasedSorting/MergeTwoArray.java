// This program will merge two array sorted order without extra space 
public class MergeTwoArray {
    public static void merge(int[] a, int[] b) {
        // calculating size
        int n = a.length;
        int m = b.length;
        // traverse first array
        for (int i = 0; i < n; i++) {
            if (a[i] > b[0]) {
                // swap
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                // shifting b[0] at correct position
                int first = b[0];
                int k;
                for (k = 1; k < m && b[k] < first; k++) {
                    b[k - 1] = b[k];
                }
                // first at correct position
                b[k - 1] = first;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 7, 10 };
        int[] b = { 2, 3 };
        merge(a, b);
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int ele : b) {
            System.out.print(ele + " ");
        }
    }
}