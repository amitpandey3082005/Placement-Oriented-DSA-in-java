/*
  Programn to print the ASCII value of any chrecter using implicit typecasting 
*/
import java.util.*;
public class printASCII{
    public static void main(String[] args){
        
        Scanner sc = new  Scanner(System.in);

        // code to take a single charecter from user 
        char c = sc.next().charAt(0);
        // // code to take integer 
        // int n = sc.nextInt();
        // // code to take double as input 
        // double d = sc.nextDouble(); 
        
        // trying to print the charecter 
        System.out.println(c + 0); // implicit typecasting logic 
        System.out.println((char)103); // explicit type casting logic 

        sc.close();
        
    }
}