class ComplexNumber {
    int real;
    int img;

    // constructor
    ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    ComplexNumber() {
    }

    // Method to add the Complex Number
    ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber res = new ComplexNumber();
        res.real = c1.real + c2.real;
        res.img = c1.img + c2.img;
        return res;
    }

    ComplexNumber mul(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber res = new ComplexNumber();

        // Formula: (a*c) - (b*d)
        res.real = (c1.real * c2.real) - (c1.img * c2.img);

        // Formula: (a*d) + (b*c)
        res.img = (c1.real * c2.img) + (c1.img * c2.real);

        return res; 
    }

    void display() {
        // Formatted to print nicely as a complex number (e.g., 3 + 6i)
        System.out.println(this.real + " + " + this.img + "i");

    }
}

public class Complex {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, -3);
        ComplexNumber c2 = new ComplexNumber(2, 3);

        // FIX: Capture the returned ComplexNumber from the add method
        ComplexNumber ans = c2.add(c1, c2);
        ComplexNumber mul = c1.mul(c1, c2);
        mul.display();
        ans.display();
    }
}
