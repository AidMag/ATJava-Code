import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        int portNumber = 0;

        if (args.length < 1) {
            // use default port.
            portNumber = 1964;
        } else {
            try {
                portNumber = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Error: using default port number instead.");
                portNumber = 1964;
            }
        }

        System.out.println("Port Number: " + portNumber);

        // ok gang, let's create a listening socket using this port number on our server.
        try (
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("From client: " + inputLine);
                out.println(inputLine);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Goodbye!");
    }
}
