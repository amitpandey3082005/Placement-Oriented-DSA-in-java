
public class wavyArray {

   
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; //[2,1,4,3,5]

        int i = 1; 

        while (i < arr.length) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i += 2;// update pairwise by 2 
        }

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
