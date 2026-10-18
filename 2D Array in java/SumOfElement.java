
public class SumOfElement {

    public static void main(String[] args) {
        // intializing an Array 
        int[][] mat1 = {{1, 2}, {7, 8}};
        int sum = 0;
        // finding the sum of all elemenyt of the 2 d arrays
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum += mat1[i][j];
            }
        }
        System.out.println(sum);
        
    }
}
