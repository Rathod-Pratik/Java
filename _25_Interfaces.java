interface Machine {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrake(int a);
}

class cars implements Machine {

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
        cars car = new cars();
        car.changeGear(3);
        car.speedUp(60);
        car.applyBrake(2);
    }
}
