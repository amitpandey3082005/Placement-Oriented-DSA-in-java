class Cricketer {
    // Here team is a static(sharable & common variale for all ) whose value can't
    // reassign (i.e. someting constant )
    static String team = "India"; // Here team is a static variable which is sharable to the part of the all

    int run;
    String name;
}

public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        c1.team = "England";
        Cricketer c2 = new Cricketer();
        c2.team = "USA";
        System.out.print(c1.team); // Here since this is sharable so when it will updat this will change for all
                                   // instance (i.e Object )
    }
}
