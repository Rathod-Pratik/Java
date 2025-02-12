// Base class (Parent)
 class Vehicle {
     void start() {
         System.out.println("Vehicle is starting.");
     }
 }

 // Derived class (Child 1 of Vehicle)
 class Car extends Vehicle {
     void drive() {
         System.out.println("Car is driving.");
     }
 }

 // Derived class (Child 2 of Vehicle)
 class Bike extends Vehicle {
     void ride() {
         System.out.println("Bike is being ridden.");
     }
 }

 // Main class to test Hierarchical Inheritance
 public class _22_Multilevel_Inheritance {
     public static void main(String[] args) {
         Car car = new Car();
         Bike bike = new Bike();

         // Car class can access methods from Vehicle
         car.start();  // Inherited from Vehicle
         car.drive();  // Defined in Car

         // Bike class can access methods from Vehicle
         bike.start(); // Inherited from Vehicle
         bike.ride();  // Defined in Bike
     }
 }

