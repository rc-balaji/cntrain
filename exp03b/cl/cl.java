import java.io.*;
import java.net.*;

public class cl {

  public static void main(String[] args) throws IOException {

    Socket socket = new Socket("localhost", 4444);

    BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    while(true) {
      
      // Read user input and send to server
      System.out.print("Client: ");  
      String msg = userInput.readLine();
      out.println(msg);

      // Receive and print server response
      String resp = in.readLine();
      System.out.println("Server: " + resp);

    }

  }

}