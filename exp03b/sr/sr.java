import java.io.*;
import java.net.*;

public class sr {

  public static void main(String[] args) throws IOException {

    ServerSocket server = new ServerSocket(4444);

    Socket socket = server.accept();

    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

    while(true) {
    
      // Receive and print client message  
      String msg = in.readLine();
      System.out.println("Client: " + msg);

      // Read user input and send to client
      BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Server: ");
      String resp = userInput.readLine();  
      out.println(resp);

    }

  }

}