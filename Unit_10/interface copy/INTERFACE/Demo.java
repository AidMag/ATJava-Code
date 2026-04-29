package INTERFACE;

import INTERFACE.BankAccount;
import INTERFACE.Animal;
import java.util.ArrayList;


public class Demo {
    public static void main(String[] args) {
        ArrayList<Measurable> accounts = new ArrayList<>();

        ArrayList<Measurable> animals = new ArrayList<>();

        Animal animal = new Animal("boots", 29);
        animals.add(animal);

        animal = new Animal("Jackson", 175);
        animals.add(animal);


        BankAccount acct = new BankAccount(1, 300);
        accounts.add(acct);

        acct = new BankAccount(1, 12300);
        accounts.add(acct);

        acct = new BankAccount(1, 378900);
        accounts.add(acct);

        
        double avg = Measurable.calcAvg(animals);

        System.out.println("Accounts: ");
        System.out.printf("avg = %.2f%n", avg);
    }
}
