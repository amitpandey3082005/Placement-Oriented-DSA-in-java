public class PrintFirstColumn {
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        // printing the column 
        for(int i=0;i<mat.length;i++){
            System.out.print(mat[i][0]+" ");    
        }
        System.out.println();
    }
}
