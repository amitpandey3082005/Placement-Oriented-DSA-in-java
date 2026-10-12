// when we pass string as an argument it create a deep copy i.e pass by value take place 

public class stringAsArgument {

    public static void change(String str) {
        str = "Mahesh";
    }

    public static void main(String[] args) {
        String str = "Amit";
        str = "Sumit";
        System.out.println(str);
        // Note String is immutable so inside pool after writing str = sumit it will change its refrence from amit and shift it with sumit 
        // ANd if we create another string for amit it will not create new string it will return the address of previous amit that was refrence by str 

        change(str);
        System.out.println(str);
    }
}
