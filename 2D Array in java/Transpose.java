
public class Transpose {

    public static void print(int[][] arr){

        // printing array using for each 
        for(int[] ele : arr){
            for(int a : ele){
                System.out.print(a+" ");
            }
            System.out.println(); // Adding new line after each row 
        }
    }

    // adding main method 
    public static void main(String[] args) {
        // intializng an Array Variable 
        int[][] arr = {{1, 2, 3}, {0, 1, 2}, {7, 8, 9}};

        // logic for transpose ( in place swapping for transpose ) Space O(1) time O(n^2)
        for (int i = 1; i < arr.length; i++) { // traverse row 
            for (int j = 0; j <= i; j++) { // traverse column 
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // calling rint function 
        print(arr);

    }
}
