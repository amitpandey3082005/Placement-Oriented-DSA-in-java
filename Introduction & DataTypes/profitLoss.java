import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
        System.out.println("Enter Cost Price (CP) : ");
        double cp = sc.nextDouble();
        System.out.println("Enter Selling Price (SP) : ");
        double sp = sc.nextDouble();
        
        if(sp == cp){ 
            System.out.println("Neither Profit Nor Loss ");
        } 
        else if ( sp > cp ) {
            System.out.println("Profit , Profit(%) is : " + ((sp-cp)/cp)* 100 +"%"); // print value without precision 
            //System.out.printf("Profit , Profit(%%) is : %.3f%%\n" , ((sp-cp)/cp)* 100 );  print values with precision up to 3 didgit
        }
        else {
            System.out.println("Loss , Loss(%) : " +((cp-sp)/cp)* 100 +"%");  // print value without precision 
           // System.out.printf("Loss , Loss(%%) : %.3f%%\n" , ((cp-sp)/cp)* 100 );  print values with precision up to 3 didgit 
        } 

        sc.close();
    }
}
