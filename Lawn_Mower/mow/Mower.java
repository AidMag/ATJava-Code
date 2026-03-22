package mow;


/*    
Your Mower class should have methods that perform these tasks
The mower can sense whether there is grass or red brick located one unit in front of it.

The last two methods in the list above require that the mower interact with the virtual yard.  
Your method declaration for these two functions should include a reference to a yard object passed as an argument to these methods.
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
            r += 1;
        } else if (o == 1) {
            c += 1;
        } else if (o == 2) {
            r -= 1;
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
    
    public void check() {
        if (o == 0) {
        } else if (o == 1) {
        } else if (o == 2) {
        } else if (o == 3) {
        } 
    }

    public void cut(Yard yard) {
        yard[r][c] = ' ';
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
