import java.util.Scanner;

public class PartA {
	public static void main(String[] args) {
        //declaring variable
        int side_1;
        int side_2;
        int side_3;
        
        //Prompting for side lengths
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first length: ");
        if (in.hasNextInt()){
            side_1 = in.nextInt();
            in.nextLine();
            if (side_1 <= 0){
                System.err.printf("ERROR: Enter an Integer %nProgram Terminating");
                in.close();
                return;
            }
        } else {
            System.err.printf("ERROR: Enter an Integer %nProgram Terminating");
            in.close();
            return;
        }
        System.out.print("Enter Second length: ");
        if (in.hasNextInt()){
            side_2 = in.nextInt();
            in.nextLine();
            if (side_2 <= 0){
                System.err.printf("ERROR: Enter an Integer %nProgram Terminating");
                in.close();
                return;
            }
        } else {
            System.err.printf("ERROR: Enter an Integer %nProgram Terminating");
            in.close();
            return;
        }       
        System.out.print("Enter Third length: ");
        if (in.hasNextInt()){
            side_3 = in.nextInt();
            in.nextLine();
            if (side_3 <= 0){
                System.err.printf("ERROR: Enter an Integer %nProgram Terminating");
                in.close();
                return;
            }
        } else {
            System.err.printf("ERROR: Enter an Integer %nProgram Terminating");
            in.close();
            return;
        }

        
        if (side_1 + side_2 > side_3 && side_1 + side_3 > side_2 && side_2 + side_3 > side_1){
            if (side_1 == side_2 && side_2 == side_3 && side_3 == side_1){
                System.out.print("Equilateral -  all three sides equal");
            } else if (side_1 != side_2 && side_2 != side_3 && side_3 != side_1){
                System.out.print("Scalene - all sides different");
            } else {
                System.out.print("Isosceles - exactly two sides equal");
            }
        } else {
            System.out.printf("Not a triangle - the three lengths cannot form a triangle");
        }

        in.close();
    }
}