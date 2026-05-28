import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class EchoServer {
    
    // make a static member variable that is an array list.
    // use the array list to keep track of active clients.
    public static ArrayList<ClientHandler> clients;

    // make a static method called broadcastMessage() that sends a String message to every active client.
    public static void broadcastMessage(String message) {
        // loop through array.
        for (int i = 0; i < clients.size(); i++) {
            ClientHandler client = clients.get(i);
            if (client != null) {
                client.sendMessage(message);
            }
        }
    }

    //make a static method to clean up our arraylist and remove old clients.
    public static void removeClient(ClientHandler client) {
        int i = clients.indexOf(client);
        if (i >= 0) {
            clients.remove(i);
        }
    }


    public static void main(String[] args) {
        int portNumber = 0;

        // create array list.
        clients = new ArrayList<>();

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

                        clients.add(clientHandler);
                } catch (IOException e) {
                        System.err.println("Error accepting client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        } finally {
            // remove outselves from the array list.
            EchoServer.removeClient(null);
        }
        System.out.println("Goodbye!");
    }
}
