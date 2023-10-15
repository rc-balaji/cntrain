import java.io.*;
import java.net.*;

public class sr {

  public static void main(String[] args) throws IOException {

    ServerSocket server = new ServerSocket(4444);

    Socket socket = server.accept();

    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

    while(true) {
      String msg = in.readLine();
      out.println(msg);
      if(msg.equals("Close"))
      break; 
    }

  }

}