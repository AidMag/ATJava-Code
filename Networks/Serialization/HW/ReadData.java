package HW;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) {
        String filepath = "employeeInfo.bin";

        // use try with resources to open the binary file for reading (as an input data stream)
        try (FileInputStream fileInputStream = new FileInputStream(filepath);
                ObjectInputStream dataInputStream = new ObjectInputStream(fileInputStream);) {

            Employee object = (Employee) dataInputStream.readObject();
            object.displayInfo();
            
        } catch (ClassNotFoundException e) {
            System.err.println("Error, unable to find data file.");
            System.err.println(e.getMessage()); 
        } catch (IOException e) {
            System.err.println("Error reading data.");
            System.err.println(e.getMessage());
        } 

        System.out.println("Done!");
    }
}