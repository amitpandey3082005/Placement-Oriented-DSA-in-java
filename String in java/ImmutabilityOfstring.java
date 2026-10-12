
public class ImmutabilityOfstring {

    public static void main(String[] args) {
        // ceating two new String with same name the method shown below will create a single string Amit and take refrece of this 
        //  Single String Amit with name s1 and s2
        // String s1 = "Amit";
        // String s2 = "Amit"

        // Now two Different string will Form 
        String s1 = "Amit";
        String s2 = new String("Amit");
        System.out.println(s1.equals(s2));
        // Now checking the Assignment operation for string 
        String str1 = "Sumit";
        str1 += "Pandey"; // so a new string with value SumitPandey will create and str will point to this newly created string which is SumitPandey
       System.out.println(str1);
        // Since string is immutable so we can not change idividual charecter of the String and it will take space complexcity ad create inefficiecy 
        String str = "Amrita";
        str = str.substring(0, 1) + 'n' + str.substring(2);

        System.out.println(str);
    }
}
