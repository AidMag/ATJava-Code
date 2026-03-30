package Bicycle_Inheridence;

public class GearedBicycle extends Bicycle{
    private int gear;
    final private int MAX_GEAR = 6;
    private final int GEARED_MAX_SPEED = 50;

    public GearedBicycle() {
        super();
        gear = 1;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if (this.gear > 6) {
            gear = 6;
        } else if (this.gear < 1) {
            gear = 0;
        } else {
            this.gear = gear;
        }
    }
    
    public void shift_up() {
        gear = gear++; 
        if (gear > 0 && gear <= MAX_GEAR) {
            gear = gear++;
        }
    }
    
    public void shift_down() {
        gear = gear--;
        if (gear < 0) {
            gear = 1;
        }
    }

    //Override the pedal method from the Bicycle class.
    public void pedal() {
        int newSpeed = getSpeed() + gear;
        if (newSpeed > GEARED_MAX_SPEED) {
            newSpeed = GEARED_MAX_SPEED;
        }
        setSpeed(newSpeed);
    }

    public void brake() {
        int speed = getSpeed() - 2;
        if (speed < 0) {
            speed = 0;
        } else if (speed > GEARED_MAX_SPEED) {
            speed = GEARED_MAX_SPEED;
        }
    }

    // override the display() method.
    public void display() {
        super.display();
        System.out.print("Gear = " + gear);
    }


    public static void main(String[] args) {
        Bicycle young = new Bicycle();
        young.pedal();
        young.pedal();
        young.display();

        GearedBicycle tracy = new GearedBicycle();
        tracy.pedal();
        tracy.pedal();
        tracy.display();
    }
}
