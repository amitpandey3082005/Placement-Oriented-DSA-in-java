
import java.util.*; // here * will include all class inside this util package 

public class commonInThree {

    public static void main(String[] args) {

        // Declaring three Arrays 
        int[] a = {2, 3, 4, 5, 9, 0, 1};
        int[] b = {8, 0, 1, 2, 3, 4};
        int[] c = {8, 2, 3, 1, 0};

        // trying to sort these Arrays 
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // initializing three varibles for indexing 
        int i = 0, j = 0, k = 0;
        // using the three pointer approch 
        while (i < a.length - 1 && j < b.length - 1 && k < c.length - 1) {
            if (a[i] == b[i] && b[j] == c[k]) {
                list.add(a[i]);
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }

        // printing arrays 
        for (int ele : list) {
            System.out.print(ele + " ");
        }
    }
}
