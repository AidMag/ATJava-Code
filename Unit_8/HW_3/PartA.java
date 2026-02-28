/*
List an example of each of the following and write a simple program that demonstrates how these items are used:
A Java-provided constant static value that is often used in mathematical and/or scientific calculations. - Math.PI
A Java-provided static method that is often used in mathematical and/or scientific calculations. - Math.sqrt
*/


public class PartA {
    public static void main(String[] args) {
        int i = 10;
        double b = 132.2;

        double sum = Math.sqrt(i + b) * Math.PI;
        System.out.print(sum);
    }
}