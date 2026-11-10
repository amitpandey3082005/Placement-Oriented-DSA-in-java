public class MissingElement1 {
    // function to search missing element from array contaiing element from 1 to n
    // with index from 0 to n-1
    public static int missing(int[] arr) {
        int i = 0;
        int n = arr.length + 1;
        while (i < arr.length) {
            if (arr[i] == n || arr[i] == i + 1 || arr[i] == arr[arr[i]-1]) {
                i++;
            } else {
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 2, 7, 4};
        System.out.print(missing(arr));
    }
}
