public class _38_Throw {

    // Method using throws keyword
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // throw keyword used to throw an exception
            throw new IllegalArgumentException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // This will cause an exception to be thrown
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkAge(20); // This will not cause an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
