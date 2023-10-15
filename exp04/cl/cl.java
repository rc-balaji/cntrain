import java.io.*;
import java.net.*;

public class cl {

  public static void main(String[] args) throws IOException {

    Socket socket = new Socket("localhost", 4444);

    BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    while(true) {
      System.out.print("Enter domain: ");
      String domain = userInput.readLine();

      out.println(domain);

      String ip = in.readLine();
      System.out.println("IP Address: " + ip); 
    }

  }

}