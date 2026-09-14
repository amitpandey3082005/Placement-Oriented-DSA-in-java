public class insertionSort{
    public static void insertionsort(int[] arr){ // Arrays Shallow Copy pass not deep copy 
          for(int i=1;i<arr.length;i++){
             int j= i;
             while(j>0 && arr[j-1]>arr[j]){
                int temp  = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
             }
          }
    }
    
    public static void main(String[] args) {
        int[] arr = {4,1,7,3,9,1,0,8};

        insertionsort(arr);

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}