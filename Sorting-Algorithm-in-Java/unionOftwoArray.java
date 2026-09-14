
import java.util.*;

public class unionOftwoArray {

    public static void main(String[] args) {
        int[] a = {2, 3, 2, 4, 9, 0, 1, 2};
        int[] b = {1, 1, 5, 4, 9, 3};

        // creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // trying to write the logic to find union of two arrays 
        // Note we will use tree set to store unique values in tree set in ordered manner to find union 
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int ele : a) {
            treeSet.add(ele);
        }

        for (int ele : b) {
            treeSet.add(ele);
        }

        // copy element of tree set into list 

        for(int ele: treeSet){
            list.add(ele);
        }

        // trying to print the treeset 
        for (int ele : list) {
            System.out.print(ele + " ");
        }

    }
}
