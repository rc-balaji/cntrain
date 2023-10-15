import java.io.*;
import java.net.*;

public class cl {

  public static void main(String[] args) throws IOException {

    Socket socket = new Socket("localhost", 4444);

    InputStream in = socket.getInputStream();
    FileOutputStream fileOut = new FileOutputStream("index.html");

    byte[] buffer = new byte[4096];
    int length;
    while ((length = in.read(buffer)) > 0) {
      fileOut.write(buffer, 0, length);
    }

    fileOut.close();
    socket.close();

  }

}