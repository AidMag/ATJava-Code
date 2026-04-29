package INTERFACE;
import java.util.ArrayList;

public interface Measurable {
   // return a measurable quantity
   // that can be used, for example,
   // to calculate an average.
   double getMeasure();

   public static double calcAvg(ArrayList<Measurable> accounts) {
      // this static method will calculate and return the
      // average measurment from a list of measurable objects.
      if (accounts.size() == 0) {
         throw new IllegalArgumentException("Your list is empty");
      }
      
      double sum = 0;

      for (int i = 0; i < accounts.size(); i++) {
         sum += accounts.get(i).getMeasure();
      }

      double avg = sum / accounts.size();
      return avg;
   }
}

