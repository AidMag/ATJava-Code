import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        String filepath = "info.bin";

        // use try with resources to open a FileOutput Stream.
        try(FileOutputStream fileOutputStream = new FileOutputStream(filepath);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);) {
            
            dataOutputStream.writeChar('t');
            // loop to stream some integer values.
            for (int i = 0; i < 10; i++) {
                // serialize each integer.
                dataOutputStream.writeInt(i);
            }

            System.out.println("data saved to " + filepath);
        } catch (IOException e){
            System.err.println("Error writing to output file.");
            System.err.println(e.getMessage());
        }
    }
}
