class Student {
    // Adding atributes and members in Student class
    int rollNo;
    String name;
    double cgpa;

    // creating parametrised construtor
    public Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    // adding method to print the attributes
    public void print() { // it can't be staic beacuse it ca not access non static member if it will be
                          // static then member shiuld also be static
        System.out.println(rollNo + " " + name + " " + cgpa + " ");
    }
}

public class PassingObjectByMethod {

    public static void change(Student s) {
        s.name = "Sumit"; // change actual attributes(i.e name ) for s1 instance
    }

    public static void main(String[] args) {
        Student s1 = new Student(21, "Amit", 9.7);
        change(s1);
        s1.print(); // print data
    }
}