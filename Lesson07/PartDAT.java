/*
 * Write a program that converts a positive integer into the Roman number system.
 * The Roman number system has digits
 */

import java.util.Scanner;

public class PartDAT {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter a number (1-3999): ");
        if (!in.hasNextInt()) {
            System.err.printf("ERROR: Not an integer. %nTerminating program");
            return;
        } else {
            num = in.nextInt();
        }

        if (num < 0) {
            System.err.printf("ERROR: Not a positive integer. %nTerminating program");
            return;
        }

        switch (num / 1000) {
            case 1:
                System.out.print("M");
                break;
            case 2:
                System.out.println("MM");
                break;
            case 3:
                System.out.println("MMM");
                break;
        }

        num = num - ((num / 1000) * 1000);

        switch (num / 100) {
            case 1:
                System.out.println("C");
                break;
            case 2:
                System.out.println("CC");
                break;
            case 3:
                System.out.println("CCC");
                break;
            case 4:
                System.out.println("CD");
                break;
            case 5:
                System.out.println("D");
                break;
            case 6:
                System.out.println("DC");
                break;
            case 7:
                System.out.println("DCC");
                break;
            case 8:
                System.out.println("DCCC");
                break;
            case 9:
                System.out.println("CM");
                break;
        }

        num = num - ((num / 100) * 100);

        switch (num / 10) {
            case 1:
                System.out.println("X");
                break;
            case 2:
                System.out.println("XX");
                break;
            case 3:
                System.out.println("XXX");
                break;
            case 4:
                System.out.println("XL");
                break;
            case 5:
                System.out.println("L");
                break;
            case 6:
                System.out.println("LX");
                break;
            case 7:
                System.out.println("LXX");
                break;
            case 8:
                System.out.println("LXXX");
                break;
            case 9:
                System.out.println("XC");
        }

        num = num - ((num / 10) * 10);

        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;                
            case 3:
                System.out.println("III");
                break;            
            case 4:
                System.out.println("IV");
                break;            
            case 5:
                System.out.println("V");
                break;            
            case 6:
                System.out.println("VI");
                break;            
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
        }

        in.close();
    }
}
