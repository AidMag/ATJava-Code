import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
    
    public static void main(String[] args) {
        // parse the input arguments.
        // do we have enought arguements?
        if (args.length < 2) {
            System.err.println("Incorrect number or arguments. Usage is EchoClient<IP addr><port>.");
            return;
        }

        //get ip address
        String server_ip = args[0];

        // get port number.
        int portNumber = 1964;
        try{
            portNumber = Integer.parseInt(args[1]);
        } catch (NumberFormatException e){
            System.err.println(e.getMessage());
            System.err.println("using default prot number instead");
        }

        // print the info to the console.
        System.out.printf("Server address: %s, Port: %d%n", server_ip, portNumber);

        // use try with resources statement.
        try (
                Socket socket = new Socket(server_ip, portNumber);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String inputString;
            while ((inputString = stdIn.readLine()) != null) {
                //send info to the server.
                out.println(inputString);

                // read info from the server.
                System.out.println("Echo: " + in.readLine());
            }
            
        } catch (UnknownHostException e) {
            System.err.println("Unknown host!");
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("IOExceptionError detected.");
            System.err.println(e.getMessage());
        }
    }
}
