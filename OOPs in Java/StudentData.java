// yo u have to enter the detail of Student with name rollNo and marks(case 1 pass marks through constructor case2 tke from user )
class StudentDetail {
    // add memebr
    int rollNo;
    String name;
    int[] marks;

    // parameterized constructor
    public StudentDetail(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks; // shallow copy of the array (Although we can go with deep copy using
                            // Arrays.copyOf())
    }

    // Adding a instance method in the StudentDetail class
    void display() {
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Name : " + this.name);
        // displaying score
        System.out.println("---- Your Score is ----");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }

}

public class StudentData {
    public static void main(String[] args) {
        int[] score1 = { 50, 60, 70, 80 };
        StudentDetail s1 = new StudentDetail(101, "Amit", score1); // we are passing array through the constructor
        s1.marks[0] = 90; // thi schange will occur in actual marks (i.e. it shows array pass through
                          // refrence in constructor )
        // displaying the attribute of the s1
        s1.display();

        int[] score2 = { 85, 60, 70, 90 };
        new StudentDetail(101, "Anand", score2).display();
    }
}
