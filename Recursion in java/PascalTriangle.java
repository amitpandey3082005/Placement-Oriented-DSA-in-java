import java.util.ArrayList;

class Solution {
    public static  ArrayList<ArrayList<Integer>> generatePascalTriangle(int numRows) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        
        if (numRows <= 0) {
            return triangle;
        }

        // first row always 1
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // 3. generate each rw by adding with previous 
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> prevRow = triangle.get(i - 1);
            ArrayList<Integer> currRow = new ArrayList<>();

            // first element of every row is 1 
            currRow.add(1);

            // Beech ke elements: prev row ke do consecutive elements ka sum
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // add element to current Row
            currRow.add(1);

            // Add element to triangle arraylist 
            triangle.add(currRow);
        }

        return triangle;
    }
}

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(Solution.generatePascalTriangle(5));
    }
}
