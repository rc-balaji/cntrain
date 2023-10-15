import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;

public class sr {

  public static void main(String[] args) throws IOException {

    ServerSocket server = new ServerSocket(4444);
    Socket socket = server.accept();

    // Read image file
    File image = new File("image.jpg"); 
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ImageIO.write(ImageIO.read(image), "jpg", baos);
    byte[] imageBytes = baos.toByteArray();

    // Send image data
    OutputStream out = socket.getOutputStream();
    out.write(imageBytes);

    socket.close();
    server.close();
  }
}