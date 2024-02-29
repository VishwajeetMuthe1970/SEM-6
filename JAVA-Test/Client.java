import java.io.*;
import java.net.*;
public class Client {
  public static void main(String[] args) throws Exception {
    Socket s = new Socket("127.0.0.1", 7777);
    if (s.isConnected()) {
      System.out.println("Connected to server");
    }
    FileOutputStream A = new FileOutputStream("received.txt");
    DataInputStream B = new DataInputStream(s.getInputStream());
    int r;
    while ((r = B.read()) != -1) {
      A.write((char) r);
    }
    s.close();
  }
}