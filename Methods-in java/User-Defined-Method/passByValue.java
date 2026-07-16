// Note Java does not directly support pass by refrence still can do something with array 
// but it does not support pointer so we can not pass these values as refrence 😊

import java.util.Scanner;

public class passByValue {

    public static void swap(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a,b :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // swaping using bitwiseXor ( Approch - 1)
        //  a = a^b;
        //  b=a^b;
        //  a=a^b;
        swap(a, b); // calling function with argument passing by value 

        System.out.println(a + " " + b);

        sc.close();
    }
}
