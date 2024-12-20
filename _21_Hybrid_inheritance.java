// Parent Class
class Vehicle {
    void fuel() {
        System.out.println("This vehicle uses fuel to run.");
    }
}

// Child Class 1
class Car extends Vehicle {
    void type() {
        System.out.println("This is a car.");
    }
}

// Child Class 2
class Bike extends Vehicle {
    void type() {
        System.out.println("This is a bike.");
    }
}

// Child Class 3
class Truck extends Vehicle {
    void type() {
        System.out.println("This is a truck.");
    }
}

// Main Class
class  _21_Hybrid_inheritance {
    public static void main(String[] args) {
        // Object of Car class
        Car car = new Car();
        car.fuel(); // Method from Vehicle class
        car.type(); // Method from Car class

        // Object of Bike class
        Bike bike = new Bike();
        bike.fuel(); // Method from Vehicle class
        bike.type(); // Method from Bike class

        // Object of Truck class
        Truck truck = new Truck();
        truck.fuel(); // Method from Vehicle class
        truck.type(); // Method from Truck class
    }
}
