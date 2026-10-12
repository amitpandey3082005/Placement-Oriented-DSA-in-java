// internally strings are considered as character array 

public class basic {

    public static void main(String[] args) {
        // implementing character array 
        char[] arr = {'a', 'm', 'i', 't'};
        // printing char array 
        for (char ele : arr) {
            System.out.print(ele);
        }
         System.out.println();
        // Apart from these character array we can use String as a data type
        String str = "AMit";
        System.out.println(str);
    }
}
