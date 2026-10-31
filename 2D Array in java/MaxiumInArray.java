public class MaxiumInArray {
    public static void main(String[] args) {

        // intializing a 2D Array 
        int[][] arr = {{1,2,3},{8,8,9},{7,6,4}};
        int max = Integer.MIN_VALUE;
        // logic to check max 
        for(int i=0;i<arr.length;i++){ // traverse row 
            for(int j=0;j<arr[0].length;j++){ // traverse column 
                if(arr[i][j] > max){
                   
                     max = arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}