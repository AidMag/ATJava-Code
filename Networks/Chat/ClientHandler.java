import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        // use try with catch statement to create output and input streams.

        // get address of our client:
        String addr = clientSocket.getInetAddress().getHostAddress();

        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Connected to client " + clientSocket.getInetAddress().getHostAddress()
                    + " on port " + clientSocket.getPort());
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received from client (" + addr + "): " + inputLine);
                // display info about what was received.
            
                // let's broadcast the message to all of the clients.
                EchoServer.broadcastMessage(addr + ": " + inputLine);
            }
            System.out.println("Client disconnected: " + clientSocket.getInetAddress());
        } catch (IOException e) {
            System.err.println("Error handling client: " + e.getMessage());
        } finally {
            try{
                if (out != null){
                    out.close();
                }
                if (in != null){
                    in.close();
                }
                if (clientSocket != null){
                    clientSocket.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }
    
    // method to send messages to this client.
    public void sendMessage(String message) {
        if (this.out != null) {
            out.println(message);
        }
    }
}