
import java.util.ArrayList;
import java.util.Arrays;

public class commonElement {

    public static void main(String[] args) {
        // Declaring two arrays 
        int[] a = {2, 3, 4, 5, 9, 0, 1};
        int[] b = {8, 0, 1, 2, 3, 4};

        // creating the ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // first sort a and b 
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < a.length - 1 && j < b.length - 1) {
            if (a[i] == b[i]) {
                list.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        // printing arraylist element 
        for (int ele : list) {
            System.out.print(ele);
        }
    }
}
