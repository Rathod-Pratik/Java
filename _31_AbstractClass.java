// Abstract class with a unique name
abstract class Shape {
    // Abstract method (must be implemented by subclasses)
    abstract void draw();

    // Concrete method (shared by all subclasses)
    void showInfo() {
        System.out.println("This is a shape.");
    }
}

// Subclass of Shape implementing the draw() method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Another subclass of Shape implementing the draw() method
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Main class to run the program
public class _31_AbstractClass {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Calling methods
        circle.showInfo();
        circle.draw();  // Calls the overridden draw() method of Circle

        System.out.println(); // For spacing

        rectangle.showInfo();
        rectangle.draw();  // Calls the overridden draw() method of Rectangle
    }
}
