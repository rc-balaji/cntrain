import java.io.*;
import java.net.*;
import javax.imageio.ImageIO; 
import javax.imageio.ImageReader; // add this
import java.awt.image.BufferedImage; //add this


public class cl {

  public static void main(String[] args) throws IOException {

    Socket socket = new Socket("localhost", 4444);

    InputStream in = socket.getInputStream();
    ByteArrayOutputStream baos = new ByteArrayOutputStream();

    byte[] buffer = new byte[1024];
    int length;
    while ((length = in.read(buffer)) != -1) {
      baos.write(buffer, 0, length);
    }

    // Convert image bytes to BufferedImage
    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    BufferedImage image = ImageIO.read(bais);

    // Save image 
    ImageIO.write(image, "jpg", new File("received.jpg")); 

    socket.close();
  }
}