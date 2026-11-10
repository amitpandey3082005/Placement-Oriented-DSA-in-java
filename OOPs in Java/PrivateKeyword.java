class Student {

    private int rollNo; // we want user can only use thi rollNo using public getter method
    String name = "Amit"; // No default value of string type name is Amit
    double cgpa;

    // Adding getter to acess rollNo
    int getRollNo() {
        return rollNo;
    }

    // public setter
    void setRollNo(int x) {
        rollNo = x;
    }

    // method to display the field values for specific instance(i.e. Object)
    void display() {
        System.out.println(rollNo + " " + name + " " + cgpa + " ");
    }
}

public class PrivateKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.cgpa = 9.8;
        s1.setRollNo(67);
        s1.display();
        System.out.println(s1.getRollNo());
    }
}
