
public class searchInRowColumnSorted {

    public static boolean matSearch(int[][] mat, int x) {
        int row = mat.length;
        int col = mat[0].length;

        int left = 0;
        int right = col - 1;

        while (left < row && right >= 0) {
            if (mat[left][right] == x) {
                return true;
            } else if (mat[left][right] > x) {
                right--;
            } else {
                left++;
            }
        }
        return false; // element not found 
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        System.out.println(matSearch(arr, 14));
    }
}
