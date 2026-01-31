import java.util.Scanner;
import java.util.Arrays;
/*
Aidan
*/

public class Minesweep {

    public static void clearScreen() {
       System.out.print("\033[H\033[2J");
       System.out.flush();
    }
    
    public static void start(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '#';
            }
        }
    }

    public static void mine_map(char[][] array) {
        char space = ' ';
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
            }
        }
        for (int minesPlaced = 0; minesPlaced < 10; minesPlaced++) {
            int r = (int) (Math.random() * 9);
            int c = (int) ((Math.random()) * 9);
            if (array[r][c] == space) {
                array[r][c] = 'm';
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 'm') {
                    continue;
                }

                //figure out how to generate the numbers
                int mineCount = 0;
                if (array[i][j] == ' ') {
                    for (int r = -1; r <= 1; r++) {
                        for (int c = -1; c <= 1 + 1; c++) {
                            if (r >= 0 && r < array.length && c >= 0 && c < array[0].length && array[r][c] == 'm') {
                                mineCount++;
                            }
                        }
                    }
                    if (mineCount > 0) {
                      array[i][j] = (char) mineCount;  
                    }
                    
                }
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

        mine_map(map);
        print(map);
    }
}