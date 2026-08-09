
import java.util.Scanner;

public class search {

    public static boolean search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 67, 88, 90, 6, 7};
        int x = 88;

        if (search(arr, x)) {
            System.out.println("Yes"); 
        }else {
            System.out.println("No");
        }

        sc.close();
    }
}
