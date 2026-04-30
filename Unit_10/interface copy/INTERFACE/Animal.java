package INTERFACE;

import java.util.ArrayList;

public class Animal implements Comparable<Animal>{
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        String s = this.getClass().getName() +
                String.format(" [name = %s, weight (lbs) = %.2f]", name, weight);
        return s;
    }

    public static double calcAvg(ArrayList<Animal> list) {
        double sum = 0;
        if (list.size() == 0) {
            return 0;
        }
        for (Animal animal : list) {
            sum = sum + animal.getWeight();
        }
        return sum / list.size();
    }


    public int compareTo(Animal o) {
        final double SMALL_NUMBER = 1.0e-100;
        if (Math.abs(this.weight - o.weight) < SMALL_NUMBER) {
            return 0;
        } else if (this.weight < o.weight) {
            return -1;
        } else {
            return +1;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        double sum = 0;

        Animal animal = new Animal("boots", 29);
        animals.add(animal);

        animal = new Animal("Jackson", 175);
        animals.add(animal);

        for (int i = 0; i < animals.size(); i++) {
          sum += animals.get(i).getWeight();
        }

        double avg = sum / animals.size();

        System.out.printf("The average weight of the animals are %.2f%n", avg);
   }

}