import java.io.*;
import java.net.*;
import java.util.*;

public class sr {

  public static void main(String[] args) throws IOException {

    ServerSocket server = new ServerSocket(4444);

    Socket socket = server.accept();

    // Domain names and IPs 
    String[] domains = {"google.com", "todo.com", "sam.com"};
    String[] ips = {"192.168.1.10", "192.168.1.11", "192.168.1.12"};

    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

    while(true) {
      String domain = in.readLine();
      String ip = "Not Found";

      for(int i=0; i<domains.length; i++) {
        if(domain.equals(domains[i])) {
          ip = ips[i];
          break;
        }
      }

      out.println(ip); 
    }

  }

}