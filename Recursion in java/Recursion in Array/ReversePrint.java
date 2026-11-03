
public class ReversePrint {

    public static void printElement(int[] arr, int idx) {
        // Base Case 
        if (idx == arr.length) {
            return;
        }
        // recursive case 
        printElement(arr, idx + 1); // you can't write idx++
        System.out.print(arr[idx]+" ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 8};
        printElement(arr, 0);
    }
}
