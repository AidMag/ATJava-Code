import java.util.Scanner;
import java.util.Arrays;
/*

*/

public class Minesweep {

    public static void clearScreen() {
       System.out.print("\033[H\033[2J");
       System.out.flush();
    }

    
    public static void mine(char[][] array) { //Figure out how to randomly generate where the mines are 
        for (int i = 0; i <= array.length; i++) {//and the numbers around them
            array[((int) Math.random() * 9 + 1)][((int) Math.random() * 9 + 1)] = 'm';
        }
    }
    
    public static void start(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '#';
            }
        }
    }

    public static void mine_map(char[][] array) {
        int r = (int) Math.random() * 9;
        int c = (int) Math.random() * 9;
        char space = ' ';
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
            }
        }
        for (int minesPlaced = 0; minesPlaced < 10; minesPlaced++) {
            if (array[r][c] == space) {
                array[r][c] = 'm';
            }
        }
    }

    public static void print(char[][] array) {
        System.out.println("   0  1  2  3  4  5  6  7  8 ");
        System.out.println("----------------------------");
        for (int i = 0; i < array.length; i++){
            System.out.print(i + "|");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] map = new char[9][9];
        char[][] board = new char[9][9];

        start(board);
        print(board);
    }
}