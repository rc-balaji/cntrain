import java.io.*;
import java.net.*;

public class cl {

  public static void main(String[] args) throws IOException {

    Socket socket = new Socket("localhost", 4444);

    BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    // int n = 3; // number of messages

    while(true) {

      System.out.print("Enter message: ");
      String msg = userInput.readLine();

      out.println(msg);
      String resp = in.readLine();

      System.out.println(resp);
      if(resp.equals("Close"))
      {
        socket.close();
        break;
      }
    }

    // socket.close();

  }

}