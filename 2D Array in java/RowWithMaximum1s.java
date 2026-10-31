class Solution {
    public static  int rowWithMax1s(int[][] arr) {
        // code here
        int maxOneRow = -1;
        int maxOne =0;
        for(int i=0;i<arr.length;i++){
            int max = 0;
            for(int j=arr[0].length-1;j>=0;j--){
                if(arr[i][j] == 1){
                
                    max++;
                }
            }
            if(max > maxOne){
                maxOne = max;
                maxOneRow = i;
            }
        }
        
        return maxOneRow;
    }
};
public class RowWithMaximum1s {
    public static void main(String[] args){
          int [][] arr = {{0,1,1,1},{0,0,1,1},{1,1,1,1}};

         int  row =  new Solution().rowWithMax1s(arr); // since method is static we can also call using Class name and . operator 

         System.out.println(row);
          
    }
}
