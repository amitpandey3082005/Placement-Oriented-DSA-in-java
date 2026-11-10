public class MissingElement {
    // find missing from an array containing element from 0 to n with 1 missing number 
  
    public static int missing(int[] arr){
        int n = arr.length;
        // Appy cyclic sort 
        int i=0;
        while(i<arr.length){
            if(arr[i] == i || arr[i] == n || arr[i] == arr[arr[i]]){
                i++;
            }else{
                // swap
                int idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i) return i;
        }
        // if all element is at right index then n will be that element which is missing
        return n;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 5, 2, 1,0, 4, 6 };
        System.out.print(missing(arr1));
    }
}
