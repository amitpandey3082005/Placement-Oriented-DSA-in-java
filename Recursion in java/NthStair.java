// We will find the solution of this problem optimal way using Dynamic Programmimg Approch to resolve overlaping 
public class NthStair {

    public static int nways(int n) {
       // Adding Base Case 
       if(n==1 || n==2) return n; // for 1 stair total wy will be 1 for 2 stair total way will be 2 
       // recursive case 
       return nways(n-1) +nways(n-2);
    }

    public static void main(String[] args) {
        int res = nways(5);
        System.out.println(res);
    }
}
