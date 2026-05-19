import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) {
        String filepath = "info.bin";

        // use try with resources to open the binary file for reading (as an input data stream)
        try (FileInputStream fileInputStream = new FileInputStream(filepath);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);) {
            int index = 0;
            int val = 0;

            // verify that it's a Thomas data stream.
            char c = dataInputStream.readChar();
            if (c == 't') {
                System.out.println("Thomas string verified");
                while (true) {
                // keep track of the number of items that we've read in.
                index++;

                // try to read the data until we get to the end of the file.
                try {
                    val = dataInputStream.readInt();
                    System.out.printf("Value #%02d: %02d%n", index, val);
                } catch (EOFException e) {
                    System.out.println("\nEnd of file reached.");
                    break;
                }
                }
            } else {
                System.err.println("Was not verified to be a Thomas data stream.");
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Error, unable to find data file.");
            System.err.println(e.getMessage()); 
        } catch (IOException e) {
            System.err.println("Error reading data.");
            System.err.println(e.getMessage());
        }

        System.out.println("Done!");
    }
}
