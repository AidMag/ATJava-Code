/*
Write a program that reads in three strings and sorts them lexicographically.
Enter three strings: Charlie Able Baker
Able
Baker
Charlie
 */


import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three words: ");
        String name1 = in.next();
        String name2 = in.next();
        String name3 = in.next();

        if (name1.compareTo(name2) <= 0 && name2.compareTo(name3) <= 0) {
            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);
        } else if (name1.compareTo(name3) <= 0 && name3.compareTo(name2) <= 0) {
            System.out.println(name1);
            System.out.println(name3);
            System.out.println(name2);
        } else if (name2.compareTo(name3) <= 0 && name3.compareTo(name1) <= 0) {
            System.out.println(name2);
            System.out.println(name3);
            System.out.println(name1);
        } else if (name2.compareTo(name1) <= 0 && name1.compareTo(name3) <= 0) {
            System.out.println(name2);
            System.out.println(name1);
            System.out.println(name3);
        } else if (name3.compareTo(name1) <= 0 && name1.compareTo(name2) <= 0) {
            System.out.println(name3);
            System.out.println(name1);
            System.out.println(name2);
        } else if (name3.compareTo(name2) <= 0 && name2.compareTo(name1) <= 0) {
            System.out.println(name3);
            System.out.println(name2);
            System.out.println(name1);
        }
        in.close();
    }
}