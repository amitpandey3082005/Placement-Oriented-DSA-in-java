import java.util.Scanner; 

class Student { 
    // Adding attributes and members in Student class 
    int rollNo; 
    String name; 
    double cgpa; 

    // adding method to print the attributes 
    public void print() { 
        // it can't be static because it can not access non static member
        System.out.println(rollNo + " " + name + " " + cgpa + " "); 
    } 
} 

public class UserInputOfAttribute { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Student s1 = new Student(); 

        System.out.print("Roll No daalein: ");
        s1.rollNo = sc.nextInt(); 

        System.out.print("CGPA daalein: ");
        s1.cgpa = sc.nextDouble(); 

        // 💡 BUFFER CLEAR: Yeh line console ka 'Enter' saaf karegi
        sc.nextLine(); 

        System.out.print("Name daalein: ");
        s1.name = sc.nextLine(); 

        System.out.println("\n--- Student Details ---");
        s1.print(); 

        sc.close(); 
    } 
}
