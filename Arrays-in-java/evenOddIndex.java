import java.util.Scanner;

public class evenOddIndex {
    public static void oddEvenIndex(int[] arr){
         for(int i=0;i<arr.length;i++){
            if(i%2!=0) arr[i]*=2;
            else arr[i]+=10;
         }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {2,3,4,-5,6,7};

        oddEvenIndex(arr);
        print(arr);
        
        sc.close();
    }
}