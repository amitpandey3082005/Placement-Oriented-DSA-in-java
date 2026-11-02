public class UniquePath {
    public static int uniquePath(int m, int n) {
        // Adding Base case
        if (m == 1 || n == 1) {
            return 1;
        }

        // recursive case 
        return uniquePath(m - 1, n) + uniquePath(m, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(uniquePath(2, 2));
    }
}
