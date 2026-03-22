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
}