package HW;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        String filepath = "employeeInfo.bin";
        Scanner in = new Scanner(System.in);
        String fname, lname;
        int id, salary;

        System.out.println("Enter Employee First Name: ");
        fname = in.next();
        System.out.println("Enter Employee Last Name: ");
        lname = in.next();
        System.out.println("Enter Employee ID Number: ");
        id = in.nextInt();
        System.out.println("Enter Employee Salary: ");
        salary = in.nextInt();
        Employee employee = new Employee(fname, lname, id, salary);
        
        in.close();

        // use try with resources to open a FileOutput Stream.
        try(FileOutputStream fileOutputStream = new FileOutputStream(filepath);
                ObjectOutputStream dataOutputStream = new ObjectOutputStream(fileOutputStream);) {
            
            dataOutputStream.writeObject(employee);
            employee.displayInfo();
            System.out.println("data saved to " + filepath);
        } catch (IOException e){
            System.err.println("Error writing to output file.");
            System.err.println(e.getMessage());
        }
    }
}
