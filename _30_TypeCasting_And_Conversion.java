public class _30_TypeCasting_And_Conversion {
    public static void main(String[] args) {

        // Demonstrating Primitive Typecasting (Widening and Narrowing)
        int intNum = 10;
        double doubleNum = intNum;  // Widening (implicit casting)
        System.out.println("Widening Casting (int to double): " + doubleNum);  // Output: 10.0

        doubleNum = 9.99;
        intNum = (int) doubleNum;  // Narrowing (explicit casting)
        System.out.println("Narrowing Casting (double to int): " + intNum);  // Output: 9 (fraction part is lost)
    }
    }
