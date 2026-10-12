
public class stringToCharArray {

    public static void main(String[] args) {
        String str = "Amit";
        //consider this method as CamelCase e.g (amtIsGoodBoy--> Camel Case) (AmitisGoodBoy--> Pascal Case)
        char[] arr = str.toCharArray();
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
