import mystuff.Random;
import java.util.Scanner;
public class DemoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random val = new Random();
        System.out.print("Enter an integer: ");
        int a = in.nextInt();

        System.out.printf("Here are 5 randomly generated numbers from 1 to %d: ", a);
        for (int l = 0; l < 5; l++) {
            int num = Random.getRandomInteger(a);
            System.out.println();
            System.out.println(num);
        }
        System.out.printf("%n Goodbye!");
    }
}