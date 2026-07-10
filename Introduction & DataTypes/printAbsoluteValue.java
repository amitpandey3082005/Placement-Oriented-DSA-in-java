import java.util.Scanner;

public class printAbsoluteValue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     // taking number as a input from the user 
      System.out.println("Enter an integer :");
      int n = sc.nextInt();

      if(n <0) n = -n; // it will magnitude of the negative values 
      
      System.out.println(n);

    sc.close();
  }  
}
