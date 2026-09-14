
public class moveZeroAtEnd {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 1, 0, 6, 0};

        // Now our Aim is to push all zeroes at the end of the array
        int i = 0; // to keep track of zero in the array swap as per need 

        // traverse to entire array 
        for (int j = 0; j < arr.length; j++) {
            // if non zero element not found 
            if (arr[j] != 0) {
                if (i != j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                i++; // move i to ahead position 
            }
        }

        // printing array 
        print(arr);
    }
}
