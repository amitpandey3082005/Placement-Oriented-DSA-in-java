// ceating a 2-D Array and printing it and tki input 

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        // creatng a 2 d Array 
        int r, c; // declare variable row and Column 
        // creating Scanner class for input 
        Scanner sc = new Scanner(System.in);

        // taking row and column as input 
        System.out.println("Enter Row : ");
        r = sc.nextInt();
        System.out.println("Enter Col : ");
        c = sc.nextInt();

        // declaring a matrix of 2 D Array 
        int[][] mat = new int[r][c];

        // intializing a 2D Array 

        int[][] mat1 = {{1,2},{7,8}};

        // taking element user input from user 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt(); 
            }

        }

        // printing the values of the 2d Arrays 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); // Adding new line 
        }

        // closing the scanner object 
        sc.close();
    }
}
