public class checkPowerOf2OrNot {
    public static void main(String[] args) {
        int n = 4;
        
        while(n%2 == 0){
            n/=2;
        }

        if(n==1) System.out.println("true");
        else System.err.println("false");
    }
}