import Bicycle_Inheridence.*;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.setSpeed(10);
        b.brake();
        b.brake();
        System.out.printf("Non-Geared Bicycle:%n");
        b.display();
        System.out.println();

        GearedBicycle c = new GearedBicycle();
        c.setSpeed(10);
        c.brake();
        c.brake();
        System.out.printf("Geared Bicycle:%n");
        c.display();


    }
}
