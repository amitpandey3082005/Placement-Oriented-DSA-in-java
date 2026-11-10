public class Duplicate {
    public static void sort1(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < arr.length) {
            if (arr[i] == i || arr[i] == n || arr[i] == arr[arr[i]]) {
                i++;
            } else {
                int idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
    }

    public static int duplicate(int[] arr) {
        int n = arr.length;
        sort1(arr); 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=i) {
                return arr[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 5, 2, 1, 0, 4, 7, 7 };
        System.out.print(duplicate(arr1)); // Output: 7
    }
}
