import java.io.*;
import java.net.*;

public class sr {

  public static void main(String[] args) throws IOException {

    ServerSocket server = new ServerSocket(4444);

    Socket socket = server.accept();

    // Send index.html file
    File file = new File("index.html");
    FileInputStream fileStream = new FileInputStream(file);
    
    OutputStream out = socket.getOutputStream();
    byte[] buffer = new byte[4096];
    int length;
    while ((length = fileStream.read(buffer)) > 0) {
      out.write(buffer, 0, length);
    }
    fileStream.close();
    
    socket.close();
    server.close();

  }

}