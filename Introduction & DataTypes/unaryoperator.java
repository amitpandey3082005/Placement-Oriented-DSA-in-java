public class unaryoperator{
    public static void main(String[]args){

        // creating a variable and initializing its values 
        int x = 10;
        int p = 10;

        // case 1 : use means first value of x will be print then increment  
        System.out.println(x++); // 10   
        System.out.println(x); // 11

        // case 2 : first increment the value then use them 
        System.out.println(++p); // 11
        System.out.println(p);   // 11 

        // case 3 : storing value using post increment operator   
        int x1 = 10;
        int y1 = x1++; // first store then increment 
        System.out.println(x1+" "+y1); // 11 10

        // case 3 : storing values with pre increment operator 
        int x2 = 10;
        int y2 = ++x2; // first use then increment 
        System.out.println(x2+" "+y2); // 11 11

    }
}