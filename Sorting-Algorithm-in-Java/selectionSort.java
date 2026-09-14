
public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 0, 7, 0, 2, 9, 7};
        
        // logic for selection sort 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // printing the array 
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
