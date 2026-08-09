import java.util.Scanner;

public class sumOfElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0,mul=1;
        
        System.out.println("Enter size of array :");
        int n = sc.nextInt();

        // creating an array of size n 
        int[] arr = new int[n];

        System.out.println("Enter Array Element :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // loop to print sum of all element 
        for(int i=0;i<n;i++){
            sum+=arr[i];
            mul*=arr[i];
        }

        System.out.println("Sum of Array element are : "+sum);
        System.out.println("Product Of Array element are : "+mul);
        
        sc.close();
    }
}