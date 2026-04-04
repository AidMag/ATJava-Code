package mow;

/*
Aidan
*/

public class Yard {
    private char[][] lawn;
    
    public Yard(int r, int c) {
        lawn = new char[r + 2][c + 2];

        for (int i = 0; i < lawn.length; i++) {
            for (int j = 0; j < lawn[i].length; j++) {
                lawn[i][j] = '+';
            }
        }

        for (int i = 0; i < lawn.length; i++) {
            for (int j = 0; j < lawn[i].length; j++) {
                if (i == 0 || i == lawn.length - 1 || j == 0 || j == lawn[i].length - 1) {
                    lawn[i][j] = 'R';
                }
            }
        }
    }

    public void cut(int i, int j, char a) {
        lawn[i][j] = a;
    }
    
    public int hieght() {
        int h = lawn.length - 2;
        return h;
    }
    public int width() {
        int w = lawn[0].length - 2;
        return w;
    }

    public void print() {
        for (int i = 0; i < lawn.length; i++) {
            for (int j = 0; j < lawn[i].length; j++) {
                System.out.print(lawn[i][j]);
            }
            System.out.println();
        }
    }

    public void print(Mower a) {
        int c = a.getCol();
        int r = a.getRow();
        for (int i = 0; i < lawn.length; i++) {
            for (int j = 0; j < lawn[i].length; j++) {
                if (i == r && c == j) {
                    if (a.getDirection() == 0) {
                        lawn[i][j] = '^';
                    } else if (a.getDirection() == 1) {
                        lawn[i][j] = '>';
                    } else if (a.getDirection() == 2) {
                        lawn[i][j] = 'v';
                    } else if (a.getDirection() == 3) {
                        lawn[i][j] = '<';
                    }
                }

                System.out.print(lawn[i][j]);
            }
            System.out.println();
        }
    }

    public char get(int a, int b) {
        return lawn[a][b];
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println();
        System.out.println();
    }

}