
public class PrintColunWise {

    public static void main(String[] args) {
        // intializing an Array 
        int[][] mat = {{9, 8}, {6, 7}};

        // logic to print columnwise when both row and column are same 
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
        
        int col = mat[0].length;
        // when both row and column are diffrent 
        for(int i=0;i<mat.length;i++){
           System.out.print(mat[i][0])
        }
    }
}
