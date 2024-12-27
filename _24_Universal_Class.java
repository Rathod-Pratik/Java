class Students {
    int roll;
    String name;

    // Constructor
    public Students(int roll, String name) {
        this.name = name;
        this.roll = roll;
    }

    // Overriding toString() to provide a meaningful string representation
    @Override
    public String toString() {
        return "Student Roll: " + roll + " Student Name: " + name;
    }

    // Overriding equals() to compare student objects based on roll and name
    @Override
    public boolean equals(Object obj) {
        // Check if the references are the same
        if (this == obj) return true;
        // Check for null and class compatibility
        if (obj == null || getClass() != obj.getClass()) return false;
        // Typecast and compare properties
        Students student = (Students) obj;
        return roll == student.roll && name.equals(student.name);
    }


    // Overriding hashCode() to generate a hash code based on roll and name
    @Override
    public int hashCode() {
        return roll * 31 + name.hashCode();
    }
}

public class _24_Universal_Class {
    public static void main(String[] args) {
        Students s1 = new Students(1, "Mohit");
        Students s2 = new Students(1, "Mohit");
        Students s3 = new Students(3, "Krish");

        // Printing the student details
        System.out.println(s1);

        // Comparing students using equals() method
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false

        // Printing hashCode values
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
