import java.util.*;

public class Create2DArrayListWith {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        // 1.Create Empty 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // 2.Add Zeroes to each row
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(0); // Pehle 0 se bhar diya taaki slots create ho jayein
            }
            list.add(row);
        }
        System.out.println(list);
        // Now we can easily set the values inside this 2d array list
        list.get(0).set(0, 10); // 0th row add 10
        list.get(0).set(1, 20);
        list.get(1).set(0, 10);
        System.out.println(list);
    }
}
