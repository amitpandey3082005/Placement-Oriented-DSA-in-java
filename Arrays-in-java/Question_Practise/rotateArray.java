import java.util.*;
public class rotateArray{
    public static void reverse(int[] arr,int left,int right){
        
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
    public static void main(String[] args){
        // leftwise rotation 
        int k = 3;
        int[] arr = {1,2,5,8,1,9}; // [8,1,9,1,2,5] ---> leftwise [8,1,9,1,2,5]
        
        // // logic to rotate array left wise 
        // reverse(arr,0,k-1); [5,2,1,8,1,9]
        // reverse(arr,k,arr.length-1);[5,2,1,9,1,8]
        // reverse(arr,0,arr.length-1);[8,1,9,1,2,5]

        // logic to rotate array rightwise 

        reverse(arr,0,arr.length-1);//[9,1,8,5,2,1]
        reverse(arr,0,k-1);//[8,1,9,5,2,1]
        reverse(arr,k,arr.length-1);//[8,1,9,1,2,5]

        // printing leftwise rotated array 
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}