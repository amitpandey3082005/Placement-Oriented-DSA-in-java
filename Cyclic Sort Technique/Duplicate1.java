public class Duplicate1 {
    public static void sort1(int[] arr) {
        int i = 0;
        int n = arr.length + 1;
        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] > n || arr[i] == arr[arr[i] - 1]) {
                i++;
            } else {
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
    }

    public static int duplicate(int[] arr) {
        int n = arr.length + 1;
        sort1(arr); // Array sort ho gaya: {1, 2, 3, 4, 5, 6, 4}

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 2, 4, 4, 6 };
        System.out.print(duplicate(arr)); // Output: 4
    }
}
