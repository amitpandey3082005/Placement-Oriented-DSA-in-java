
public class MinimumOfMaxOfRow {

   public static int minOfMaxOfRow(int[][] mat) {

      int min = Integer.MAX_VALUE;
      for (int i = 0; i < mat.length; i++) { // traverse row

         // traverse each row to get maximum in each row
         int max = Integer.MIN_VALUE;
         for (int j = 0; j < mat[0].length; j++) {
            if (mat[i][j] > max) {
               max = mat[i][j];
            }
         }
         // storing max in temp to compare min
         int temp = max;
         if (min > temp) {
            min = temp;
         }
      }
      return min;
   }

   public static void main(String[] args) {
      int[][] arr = { { 1, 2, 3 }, { 0, 1, 2 }, { 7, 8, 9 } };

      int res = minOfMaxOfRow(arr);

      System.out.println(res);
   }
}
