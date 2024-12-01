class MyInfo {
    private int age;
    private String name; // Fixed casing for variables

    // Default constructor
    public MyInfo() {
        System.out.println("You have not entered your name or age.");
    }

    // Constructor with int and String parameters
    public MyInfo(int myId, String myName) {
        this.age = myId;
        this.name = myName;
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
    }

    // Constructor with only String parameter
    public MyInfo(String myName) {
        this.name = myName;
        System.out.println("Your name is " + name);
    }
}

public class _18_Constructor {
    public static void main(String[] args) {
        // Default constructor
        MyInfo p1 = new MyInfo();

        // Constructor with String parameter
        MyInfo p2 = new MyInfo("Rathod Pratik");

        // Constructor with int and String parameters
        MyInfo p3 = new MyInfo(10, "Rathod Pratik");
    }
}
