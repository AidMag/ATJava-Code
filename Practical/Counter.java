public class Counter {
    // data model
    // mamber variable to represent the current count.
    private int count = 0;

    // public interface.

    // add one to our counter.
    public void click() {
        // increase count by 1
        count++;
        if (count > 9999) {
            count = 0;
        }
    }
    
    // reset the counter.
    public void reset() {
        count = 0;
    }
    
    // get value
    public int read() {
        return count;
    }

    public static void main(String[] args) {
        // create a counter.
        Counter mycounter = new Counter();

        // display count to console
        System.out.println("current count = " + mycounter.read());

        // click it two times.
        mycounter.click();
        mycounter.click(); 

        // display count to console
        System.out.println("current count = " + mycounter.read());
    }
}