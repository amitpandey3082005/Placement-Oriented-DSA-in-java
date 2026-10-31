import java.util.*;

public class Basic {

    public static void main(String[] args) {
        
        // creating a 2-D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);a.add(30);a.add(40);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(50);b.add(60);b.add(70);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(10);c.add(30);c.add(40);
        // adding arrayList to Arrayist for 2d arrayList
        list.add(a);list.add(b);list.add(c);
        System.out.println(list);

        // [[10, 30, 40], [50, 60, 70], [10, 30, 40]]

        // changing the first arrylist element 30 to 50
        list.get(0).set(1,80);
        System.out.println(list);

        // Adding new ArrayList tp the list ArrayList 
        list.add(new ArrayList<>());
        System.out.println(list);

        // Initializes a mutable 2D ArrayList with fixed values
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(List.of(
            new ArrayList<>(List.of(1, 2, 3)),
            new ArrayList<>(List.of(4, 5, 6)),
            new ArrayList<>(List.of(7, 8, 9))
        ));
        // pring matix 2d arraylist
        System.out.println(matrix);
    }
}
