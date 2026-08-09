
public class lcmHcf {

    // write function to calculate hcf through recursion 
    public static int gcd(int a, int b) {
        // base case 
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // write function to calculate gcd or hcf without recursion 
    public static int gcd1(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // using euclid algorith m 
        // LCM(a,b) = (a/hcf)*b
        int a = 6, b = 36;
        System.out.println("HCF(a,b): " + gcd(a, b));
        System.out.println("LCM(a,b): " + (a / gcd1(a, b)) * b);
    }
}
