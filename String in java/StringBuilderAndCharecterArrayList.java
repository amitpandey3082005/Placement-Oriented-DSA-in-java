
import java.util.ArrayList;

public class StringBuilderAndCharecterArrayList {

    public static void main(String[] args) {
        // We have 2 ALternate way to overcome string immutability using Charecter ArrayList or StringBuilder
        // creating character array List 
        ArrayList<Character> str = new ArrayList<>();
        str.add('A');
        str.set(0, 'm'); // this method will only add value when value at specified index is preset if not present it will not print 
        System.out.println(str);

        // using StringBuilder 
        StringBuilder sb = new StringBuilder("Amit");
        sb.append(" Pandey"); // append at the end of he String 
        sb.setCharAt(0, 's');

        System.out.println(sb);
        // printing length and size of string Builder (By default capacity of String is 16 but we can set its values )
        System.out.println(sb.length() + " " + sb.capacity());

        // creating string builder with defined capacity and set value with append method 
        StringBuilder sb1 = new StringBuilder(5); // setting capacity of String builder with 5 
        sb1.append("Amit Pandey");
        System.out.println(sb1);

    }
}
