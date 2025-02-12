// Normal import: Importing Scanner class from java.util package
import java.util.Scanner;

// Static import: Importing static members of Math class
import static java.lang.Math.*;


public class _33_Type_Of_import {
    public static void main(String[] args) {
        // Using Scanner (normal import)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Using static import: Calling sqrt() and pow() directly without Math. prefix
        double squareRoot = sqrt(number);  // sqrt() is from Math class
        double power = pow(number, 2);     // pow() is from Math class

        // Displaying results
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Square (Power of 2): " + power);

        // Closing the scanner
        scanner.close();
    }
}
