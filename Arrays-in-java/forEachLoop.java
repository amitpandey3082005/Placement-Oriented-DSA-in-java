import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1,2,4,5};

        // traversing array using for loop 
        for(int ele: arr){
            System.out.print(ele+" "); // Remark : foreach loop only traverse element of data structure can't modify element of data structure 
        }
        
        // trying to modify and print 

        for(int ele : arr){
            ele*=2;
        }

        // printing array after modification 
        for(int ele: arr){
            System.out.print(ele+" ");
        }

        // Hence foreach loop only traverse element of data structure not modify or update them 

        sc.close();
    }
}