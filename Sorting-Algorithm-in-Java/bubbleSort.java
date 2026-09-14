
public class bubbleSort {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 3, -7, 9, 1, 2, 4};

        print(arr);

        // writig the Bruteforce approch of bubble sort without any optiization  time complexcity O(n^2) in all but ot preferred 
        // for(int i=1;i<=arr.length-1;i++){
        //     for(int j = 1;j<arr.length;j++){
        //         if(arr[j-1]>arr[j]){
        //             int temp = arr[j-1];
        //             arr[j-1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        // Optimized Approch O(n^2) but it will be much better than above logic  in all case 
        // for (int i = 1; i <= arr.length - 1; i++) {
        //     for (int j = 1; j < arr.length - i; j++) {
        //         if (arr[j - 1] > arr[j]) {
        //             int temp = arr[j - 1];
        //             arr[j - 1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        // Most optimized bubble sort with swap count 
        // BestCase O(n) worst and average case O(n^2)
        for (int i = 1; i <= arr.length - 1; i++) {
            int swapcount = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapcount++;
                }
            }
            if (swapcount == 0) {
                break;
            }
        }

        print(arr);
    }
}
