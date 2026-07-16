// creating a simple user defined function 

import java.util.Scanner;

public class basic {

    // define a function in java to print hello 
    public static void printHello() {
        System.out.println("Hello ! ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // calling function printHello()
        printHello();

        sc.close();
    }
}
