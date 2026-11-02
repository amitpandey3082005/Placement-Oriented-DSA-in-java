// further this problem can be resolved using Dynamic Programming Approch 
public class NthFibonacci {

    // time Complexcity O(2^n) and SpaceComplexcity O(n)
    public static int nthFibonacci(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return n;
        }

        // recursive case
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int res = nthFibonacci(3);
        System.out.println(res);
    }
}
