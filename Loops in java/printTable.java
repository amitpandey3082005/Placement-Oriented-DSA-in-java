import java.util.Scanner;

public class printTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // it will itetrate upto 10 times 
        for(int i=1;i<=10;i++){
            System.out.print(17*i + " ");
        } System.out.println();

        // it will itetrate upto 10 times 
        for(int i=17;i<=170;i+=17){
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}