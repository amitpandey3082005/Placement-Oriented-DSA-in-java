import java.util.*;

public class Create2DArrayListWith1 {
    public static void main(String[] args) {
        // Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // List.of() se data create karke ArrayList me add karna
        list.add(new ArrayList<>(List.of(1, 1, 2))); // Row 0
        list.add(new ArrayList<>(List.of(1, 1, 2))); // Row 1
        list.add(new ArrayList<>(List.of(1, 1, 2))); // Row 2

        System.out.println(list);
    }
}
