// Final class (cannot be inherited)
    final class ConstantValues {
        // Final variable (value cannot be changed)
        final double PI = 3.14159;

        // Final method (cannot be overridden)
        final void displayPI() {
            System.out.println("Value of PI: " + PI);
        }
    }

    // Main class to run the program
    public class _32_FinalClass {
        public static void main(String[] args) {
            // Creating an object of the final class
            ConstantValues obj = new ConstantValues();

            // Calling the final method
            obj.displayPI();

            // Attempting to modify the final variable (Uncommenting the below line will cause an error)
            // obj.PI = 3.14;  // ERROR: Cannot assign a value to final variable 'PI'
        }
    }
