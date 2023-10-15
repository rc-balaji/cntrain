# packages
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO; 
import java.awt.image.BufferedImage; 



# Clint init
public class cl{
    public static void main(String[] args) throws IOException{
        
    }
}

1.Create a object for Socket(host,port)
    --- Socket socket = new Socket("localhost",3000);
2.Create a object for BufferReader(inputStream);
    ---BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    1.BufferedReader()
      2.new InputStreamReader()
        3.socket.getInputStream()
3.Read a Server data using Readline
---      String read = input.readLine();

4.close input and socket

        socket.close();
        input.close();


# Server init


public class sr {
    public static void main(String[] args) throws IOException {
        
    }
}

1.Create a object for ServerSocket(port)
        ServerSocket server = new ServerSocket(3000);

2.Create Varible to Accept the req using Socket

        Socket socket = server.accept();
3.Create the object for PrintWriter(outputstream)

 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  
    out.println("Hello Client! Here is some data from the server...");
4.close
     


