
public class printuptoN {

    public static void printNumber(int n) {
        // Bse case 
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        // recursive call 
        printNumber(n - 1);
    }

    public static void printNumbe1(int n) {
        // Base case 
        if (n <= 0) {
            return;
        }

        printNumbe1(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printNumber(5);
        System.out.println();
        printNumbe1(5);
    }
}
