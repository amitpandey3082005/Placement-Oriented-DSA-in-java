/* for given AP : 99,95,91,87..... upto all terms . we have to print all positive term of this AP  */
import java.util.Scanner;

public class printPositiveTermOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // // Approch 1 
        // for(int i=99;i>0;i-=4){
        //   System.out.print(i+" ");
        // }

        // Approch 2
        int a = 99, d = -4;
        for(int i=99;i>0;i-=4){
          System.out.print(a+" ");
          a-=4;
        }
        
        sc.close();
    }
}