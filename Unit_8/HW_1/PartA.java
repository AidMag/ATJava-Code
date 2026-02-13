/*
Aidan
*/

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.printf("%s%n", name);
        System.out.print("Enter you age: ");
        int age = in.nextInt();
        System.out.print(age);

        in.close();
    }
}