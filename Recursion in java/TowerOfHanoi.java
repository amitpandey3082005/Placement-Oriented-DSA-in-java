import java.util.*;

public class TowerOfHanoi {
    // a = source, b = destination, c = helper
    public static void stepToGenerateHanoiTower(int n, char a, char b, char c) {
        if (n == 0)
            return;
        
        // 1. Move n-1 disks from Source(a) to Helper(c) using Destination(b)
        stepToGenerateHanoiTower(n - 1, a, c, b); 
        
        // 2. Print current move
        System.out.print(a + "->" + b + " ");
        
        // 3. Move n-1 disks from Helper(c) to Destination(b) using Source(a)
        stepToGenerateHanoiTower(n - 1, c, b, a);
    }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        stepToGenerateHanoiTower(n, 'a', 'b', 'c');
        sc.close();
    }
}
