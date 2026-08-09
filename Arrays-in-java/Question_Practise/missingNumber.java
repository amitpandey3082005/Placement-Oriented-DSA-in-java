public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = arr.length+1; // store number of  element of array + 1 to calculate sum up to n 
        long sum = 0; // to prevent from overflow for large value input o sum 
        // logic for 1 to n ( sum of n and - sum of array)
        long sumOfn = (n*(n+1))/2; // to prevent overflow 

        for(int ele: arr){
            sum+=ele;
        }

        System.out.println(sumOfn - sum);
    }
}