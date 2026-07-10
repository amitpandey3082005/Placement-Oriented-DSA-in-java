import java.util.Scanner;

public class basicLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
          working fact of for loop i.e (Dry Run )
            *  intialization --- at once 
            * condition ----- repeated until condition meet 
            * work ----- repeated  untill condition meet 
            * incfrement ---- repeated  untill condition meet 
        */
        
        // print name 

        for(int i=1;i<=3;i++){
            System.out.println("Amit ");
        }

        // print diferent numbers 

        /* to count number of itetration  [a,b]  i.e. (b-a)+1 times itetrate */
         int i;
        for( i=1;i<=10;i++){ // it will run upto [1,10] i.e. 10-1+1 = 10 times run and it will break at 11
             System.out.println(i);
         }
          System.out.println(i);


        // decrementing for loop 
        for(int i=10;i>=1;i--){
            System.out.println(i);
        } 

        sc.close();
    }
}