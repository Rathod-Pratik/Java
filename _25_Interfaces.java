interface Vehicles {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrake(int a);
}

class Cars implements Vehicles {

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
        car.changeGear(3);
        car.speedUp(60);
        car.applyBrake(2);
    }
}
