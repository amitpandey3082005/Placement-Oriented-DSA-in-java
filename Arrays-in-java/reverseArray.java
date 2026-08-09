public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,7,8,9,2,4};
       int left=0,right=arr.length-1;
       while(left<right){
         int temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;
         left++;right--;
       }

       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
}