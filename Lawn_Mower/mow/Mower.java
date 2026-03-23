package mow;

/*    
Aidan
*/

public class Mower {
    private int r = 0;
    private int c = 0;
    private int o = 0;

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
}