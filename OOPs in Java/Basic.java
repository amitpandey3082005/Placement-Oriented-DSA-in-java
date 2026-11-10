// creating a student class 
class Student{
    // Adding atributes and members in Student class 
    int rollNo;
    String name;
    double cgpa;
    // creating parametrised construtor 
    public Student(int rollNo,String name,double cgpa){
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }
    // adding method to print the attributes 
    public  void print(){ // it can't be staic beacuse it ca not access non static member if it will be static then member shiuld also be static 
        System.out.println(rollNo+" "+name+" "+cgpa+" ");
    }
}
public class Basic {
    public static void main(String[] args) {
        // creating object of the student class 
        Student s1 = new Student(101,"Amit",8.9);
        s1.print();
        Student s2 = new Student(23, "Sumit", 9.2);
        s2.print();
    }
}