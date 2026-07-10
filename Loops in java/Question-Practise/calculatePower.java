import java.util.Scanner;

public class calculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Base and Power (e,p)");
        int base = sc.nextInt();
        int power = sc.nextInt();
        int result=1;

        for(int i=1;i<=power;i++){
            result*=base;
        }

        System.out.println("Power of (e,p): "+result);
        
        sc.close();
    }
}