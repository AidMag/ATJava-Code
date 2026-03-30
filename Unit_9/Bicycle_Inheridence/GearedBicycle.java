package Bicycle_Inheridence;

public class GearedBicycle extends Bicycle{
    private int gear;
    final private int MAX_GEAR = 6;
    private final int GEARED_MAX_SPEED = 50;

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
        int newSpeed = getSpeed() + getGear();
        if (newSpeed > GEARED_MAX_SPEED) {
            newSpeed = GEARED_MAX_SPEED;
        }
        setSpeed(newSpeed);
    }











    public static void main(String[] args) {
        GearedBicycle b = new GearedBicycle();
        b.pedal();
        b.setGear(5);
        System.out.println("Speed = " + b.getSpeed());
        System.out.println("Gear = " + b.getGear());
    }
}
