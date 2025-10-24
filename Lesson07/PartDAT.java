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
                System.out.print("MM");
                break;
            case 3:
                System.out.print("MMM");
                break;
        }

        num = num - ((num / 1000) * 1000);

        switch (num / 100) {
            case 1:
                System.out.print("C");
                break;
            case 2:
                System.out.print("CC");
                break;
            case 3:
                System.out.print("CCC");
                break;
            case 4:
                System.out.print("CD");
                break;
            case 5:
                System.out.print("D");
                break;
            case 6:
                System.out.print("DC");
                break;
            case 7:
                System.out.print("DCC");
                break;
            case 8:
                System.out.print("DCCC");
                break;
            case 9:
                System.out.print("CM");
                break;
        }

        num = num - ((num / 100) * 100);

        switch (num / 10) {
            case 1:
                System.out.print("X");
                break;
            case 2:
                System.out.print("XX");
                break;
            case 3:
                System.out.print("XXX");
                break;
            case 4:
                System.out.print("XL");
                break;
            case 5:
                System.out.print("L");
                break;
            case 6:
                System.out.print("LX");
                break;
            case 7:
                System.out.print("LXX");
                break;
            case 8:
                System.out.print("LXXX");
                break;
            case 9:
                System.out.print("XC");
        }

        num = num - ((num / 10) * 10);

        switch (num) {
            case 1:
                System.out.print("I");
                break;
            case 2:
                System.out.print("II");
                break;                
            case 3:
                System.out.print("III");
                break;            
            case 4:
                System.out.print("IV");
                break;            
            case 5:
                System.out.print("V");
                break;            
            case 6:
                System.out.print("VI");
                break;            
            case 7:
                System.out.print("VII");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 9:
                System.out.print("IX");
                break;
        }

        in.close();
    }
}
