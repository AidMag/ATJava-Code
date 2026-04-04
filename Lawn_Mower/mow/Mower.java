package mow;

/*    
Aidan
*/

public class Mower {
    private int r;
    private int c;
    private int o;

    public Mower() {
        r = 0;
        c = 0;
        o = 0;
    }

    public Mower(int r, int c, int o) {
        this.r = r;
        this.c = c;
        this.o = o;
    }

    public int getRow() {
        return r;
    }

    public int getCol() {
        return c;
    }

    public int getDirection() {
        return o;
    }

    public void setRow(int row) {
        this.r = row;
    }

    public void setCol(int col) {
        this.c = col;
    }

    public void setDirection(int direction) {
        this.o = direction;
    }


    public void set_position(int i, int j) {
        r = i;
        c = j;
    }

    public int orientation() {
        return o;
    }

    public void set_orientation(int a) {
        o = a;
    }

    public void move() {
        if (o == 0) {
            r -= 1;
        } else if (o == 1) {
            c += 1;
        } else if (o == 2) {
            r += 1;
        } else if (o == 3) {
            c -= 1;
        }
    }
    
    public void turn_l() {
        if (o == 0) {
            o = 3;
        } else if (o == 1) {
            o = 0;
        } else if (o == 2) {
            o = 1;
        } else if (o == 3) {
            o = 2;
        }
    }
    
    public char check(Yard yard) {
        char brick = 'R';
        char grass = '+';
        char emty = ' ';

        if (o == 0) {
            if (yard.get(r - 1, c) == brick) {
                return brick;
            } else if (yard.get(r - 1, c) == grass) {
                return grass;
            }
        } else if (o == 1) {
            if (yard.get(r, c + 1) == brick) {
                return brick;
            } else if (yard.get(r, c + 1) == grass) {
                return grass;
            }
        } else if (o == 2) {
            if (yard.get(r + 1, c) == brick) {
                return brick;
            } else if (yard.get(r + 1, c) == grass) {
                return grass;
            }
        } else if (o == 3) {
            if (yard.get(r, c - 1) == brick) {
                return brick;
            } else if (yard.get(r, c - 1) == grass) {
                return grass;
            }
        }
        return emty;
    }

    public void cut(Yard yard) {
        yard.cut(r, c, ' ');
    }
    
    public void turn_r() {
       if (o == 0) {
            o = 1;
        } else if (o == 1) {
            o = 2;
        } else if (o == 2) {
            o = 3;
        } else if (o == 3) {
            o = 0;
        } 
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public void startPostition(Yard yard) {
        int r = yard.hieght();
        int c = yard.width();
        o = (int) (Math.random() * 3);
        int corner = (int) ((Math.random() * 4) + 1);

        if (corner == 1) {
            set_position(1, 1);
        } else if (corner == 2) {
            set_position(1, c);
        } else if (corner == 3) {
            set_position(r, c);
        } else if (corner == 4) {
            set_position(r, 1);
        }
    }

    public boolean updateMower(Yard yard){
        if (yard.get(r + 1, c) == '+') {
            o = 0;
            return true;
        } else if (yard.get(r - 1, c) == '+') {
            o = 2;
            return true;
        } else if (yard.get(r, c + 1) == '+') {
            o = 1;
            return true; 
        } else if (yard.get(r, c - 1) == '+') {
            o = 3;
            return true; 
        } else {
            return false;
        }
    }
}