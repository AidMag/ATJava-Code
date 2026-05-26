
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import Server.ClientHandler;

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
        try (ServerSocket serverSocket = new ServerSocket(portNumber);) {
            System.out.println("Multi echo server listening on port " + portNumber);
            while (true) {
                try {
                        Socket clientSocket = serverSocket.accept(); // Accept incoming client connection
                        System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());
                        // Create a new thread to handle the client
                        ClientHandler clientHandler = new ClientHandler(clientSocket);
                        new Thread(clientHandler).start();
                } catch (IOException e) {
                        System.err.println("Error accepting client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
        System.out.println("Goodbye!");
    }
}