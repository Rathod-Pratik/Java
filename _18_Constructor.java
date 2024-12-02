class MyClass {
    private int age;
    private String name; // Fixed casing for variables

    // Default constructor
    public MyClass() {
        System.out.println("You have not entered your name or age.");
    }

    // Constructor with int and String parameters
    public MyClass(int myId, String myName) {
        this.age = myId;
        this.name = myName;
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
    }

    // Constructor with only String parameter
    public MyClass(String myName) {
        this.name = myName;
        System.out.println("Your name is " + name);
    }
}

public class _18_Constructor {
    public static void main(String[] args) {
        // Default constructor
        MyClass p1 = new MyClass();

        // Constructor with String parameter
        MyClass p2 = new MyClass("Rathod Pratik");

        // Constructor with int and String parameters
        MyClass p3 = new MyClass(10, "Rathod Pratik");
    }
}
