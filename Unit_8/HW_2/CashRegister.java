import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {
    private ArrayList<Double> items = new ArrayList<>();
    private double sum;
    private int count;

   public void addItem(double price) {
       items.add(price);
   }

   public double getTotal() {
       for (int i = 0; i < items.size(); i++) {
           sum += items.get(i);
       }
       return sum;
   }

   public void print() {
       System.out.print(items.toString());
   }

   public void delete() {
       items.remove(count);
   }

   public int getCount() {
       count = items.size();
       return count;
   }

   public void clear() {
       for (int i = 0; i < items.size(); i++) {
           items.set(i, 0.0);
       }
   }

   public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       CashRegister cr = new CashRegister();
       System.out.print("Enter cost of item: ");
       while (true) {
        System.out.print("Enter cost of item: ");
           
        
            if (in.hasNextInt()) {
                cr.addItem(in.nextInt());  
            } else if (in.hasNext("t")) {
                cr.print();
            } else if (in.hasNext("d")) {
                cr.delete();
            } else if (in.hasNext("c")) {
                cr.clear();
            } else if (in.hasNext("q")) {
                return;
            }
           
        in.close();
       }
   }
}


