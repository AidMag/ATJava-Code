package Lesson_30;

/*
Aidan
*/


public abstract class Sensor {
    private String name;
    private int modelNumber;

    public Sensor(String name, int modelNumber) {
        this.name = name;
        this.modelNumber = modelNumber;
    }

    public int getNumber() {
        return modelNumber;
    }

    public void setNumber(int newModelNumber) {
        this.modelNumber = newModelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public abstract void recordMeasurement();
}
