public class Polymorphism {
    public static class Dog {
        // Adding a method
        void speak() {
            System.out.println("Bhau Bhau");
        }
    }

    public static class Crow {
        void speak() {
            System.out.println("Kaw Kaw");
        }
    }

    public static class Human {
        void speak() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        new Dog().speak(); // Bhau Bhau
        new Crow().speak();// Kaw Kaw
        new Human().speak();// Hello
    }
}
