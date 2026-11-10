class Student {
    // Adding instance variable i.e. class memeber
    int rollNo;
    String name;
    double cgpa;

    // creating a default constructor
    Student() {
        // this is the default constructor
    }

    // creting a parameterized constructor
    Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    Student(String name, int rollNo, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    // adding a method display
    void display() {
        System.out.println(rollNo + " " + name + " " + cgpa);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // creating 3 different object
        Student s1 = new Student(); // create object using default constructor
        s1.rollNo = 101;
        s1.name = "Amit";
        s1.cgpa = 8.8;
        s1.display();

        // creating object with two different parameterized constructor
        new Student(102, "Sumit", 9.8).display();

        new Student("Anand", 103, 7.8).display();
    }
}