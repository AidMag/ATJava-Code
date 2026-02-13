/*
Aidan
*/

import java.util.Scanner;

public class Counter {
    // data model
    // mamber variable to represent the current count.
    private int count = 0;

    // public interface.

    // add one to our counter.
    public void click() {
        // increase count by 1
        count++;
        if (count > 9999) {
            count = 0;
        }
    }
    
    // reset the counter.
    public void reset() {
        count = 0;
    }
    
    // get value
    public int read() {
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Counter cake = new Counter();
        Counter pie = new Counter();
        boolean a = false;

        while (a == false) {
            System.out.print("Enter your favorite dessert (p - pie; c - cake): ");
            String dessert = in.nextLine();
            if (dessert.equals("c")|| dessert.equals("C")) {
                cake.click();
            } else if (dessert.equals("p") || dessert.equals("P")) {
                pie.click();
            } else {
                a = true;
            } 
        }
        

        System.out.println("Votes:");
        System.out.println("Pie: " + pie.read());
        System.out.print("Cake: " + cake.read());

        in.close();
    }
}            