import java.util.Scanner;

public class Die {
    private int value;

    public Die() {
        value = 1;
    }

    public Die(int num) {
        value = num;
    }

    public void roll() {
        value = (int) ((Math.random() * 6) + 1);
    }

    public int look() {
        return value;
    }

    public void printASCII(int num) {
        int i = num;
        if (i == 1) {
            System.out.printf("+--------+%n|        |%n|    0    |%n|        |%n+--------+%n%n");
        } else if (i == 2) {
            System.out.printf("+--------+%n| 0      |%n|         |%n|      0 |%n+--------+%n%n");
        } else if (i == 3) {
            System.out.printf("+--------+%n| 0      |%n|    0    |%n|      0 |%n+--------+%n%n");
        } else if (i == 4) {
            System.out.printf("+--------+%n| 0    0 |%n|        |%n| 0    0 |%n+--------+%n%n");
        } else if (i == 5) {
            System.out.printf("+--------+%n| 0    0 |%n|    0    |%n| 0    0 |%n+--------+%n%n");
        } else if (i == 6) {
            System.out.printf("+--------+%n| 0    0 |%n| 0     0 |%n| 0    0 |%n+--------+%n%n");
        }
    }

    public void printASCII() {
        int i = value;
        if (i == 1) {
            System.out.printf("+--------+%n|        |%n|    0   |%n|        |%n+--------+%n%n");
        } else if (i == 2) {
            System.out.printf("+--------+%n| 0      |%n|        |%n|      0 |%n+--------+%n%n");
        } else if (i == 3) {
            System.out.printf("+--------+%n| 0      |%n|    0   |%n|      0 |%n+--------+%n%n");
        } else if (i == 4) {
            System.out.printf("+--------+%n| 0    0 |%n|        |%n| 0    0 |%n+--------+%n%n");
        } else if (i == 5) {
            System.out.printf("+--------+%n| 0    0 |%n|    0   |%n| 0    0 |%n+--------+%n%n");
        } else if (i == 6) {
            System.out.printf("+--------+%n| 0    0 |%n| 0    0 |%n| 0    0 |%n+--------+%n%n");
        }
    }

    public void pair() {
        int first = (int) ((Math.random() * 6) + 1);
        int second = (int) ((Math.random() * 6) + 1);
        printASCII(first);
        printASCII(second);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Die a = new Die();
        System.out.print("Enter 's' to set the die or 'n' to skip: ");
        if (in.hasNext("s")) {
            System.out.print("Enter an interger between 1-6: ");
            in.next();
            int b = in.nextInt();
            a = new Die(b);
        } else if (!in.hasNext("s")) {
            a = new Die();
        }
        System.out.printf("Enter 'r' to roll, 'd' to display (formated), 'n' to display, 'p' to roll a pair, and 'q' to quit%n");
        while (true) {
            System.out.print("Enter a command: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.close();
                break;
            } else if (in.hasNext("r")) {
                in.next();
                a.roll();
            } else if (in.hasNext("d")) {
                in.next();
                a.printASCII();
            } else if (in.hasNext("n")) {
                in.next();
                System.out.println(a.look());
            } else if (in.hasNext("p")) {
                in.next();
                a.pair();
            }
        }
    }
}