interface Vehicles {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrake(int a);
}

class cars implements Vehicles {

    @Override
    public void changeGear(int a) {
        System.out.println("Your Gear is " + a);
    }

    @Override
    public void speedUp(int a) {
        System.out.println("Your speed is " + a + " km/h");
    }

    @Override
    public void applyBrake(int a) {
        System.out.println("You pressed the brake " + a + " times");
    }
}

public class _25_Interfaces {
    public static void main(String[] args) {
        Cars car = new Cars();
        Car.changeGear(3);
        Car.speedUp(60);
        Car.applyBrake(2);
    }
}
