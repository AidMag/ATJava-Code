import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {
    private ArrayList<Double> items = new ArrayList<>();
    private double sum;

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
       items.remove(items.size() - 1);
   }

   public int getCount() {
       return items.size();
   }

   public void clear() {
       items.clear();
       sum = 0;
   }

   public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       CashRegister cr = new CashRegister();
       
       while (true) {
           System.out.print("Enter cost of item: ");
           

           if (in.hasNextDouble()) {
               Double a = in.nextDouble();
               cr.addItem(a);
               continue;
           } else if (in.hasNext()) {
               String word = in.next();
               if (word.equals("t")) {
                   cr.print();
                   System.out.println(" ");
               } else if (word.equals("d")) {
                   cr.delete();
               } else if (word.equals("c")) {
                   cr.clear();
               } else if (word.equals("q")) {
                   break;
               }
           }

       }
       in.close();
   }
}


