public class Sort {
    // use this block when array contain element from 1 to n and index are from 0 to n-1
    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1) { // element is at right index
                i++;
            } else {
                // swap
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
    }

    // when array will ontain element from 0 to n with index from (0 to n)
    public static void sort1(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i) {
                i++;
            } else {
                int idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 2, 7, 4, 6 }; // array is containing 1 to n elemenet i.e. 1 to 7 element
        int[] arr1 = { 3, 1, 5, 2, 7, 0, 4, 6 };
        sort(arr);
        sort1(arr1);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }System.out.println();
        for (int ele : arr1) {
            System.out.print(ele + " ");
        }
    }
}