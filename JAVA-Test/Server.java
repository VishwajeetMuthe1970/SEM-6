import java.io.*;
import java.net.*;
class Server {
  public static void main(String args[]) throws Exception {
    ServerSocket ss = new ServerSocket(7777);
    Socket s = ss.accept();
    System.out.println("connected..........");
     
    FileInputStream file = new FileInputStream("Send.txt");
    DataOutputStream data = new DataOutputStream(s.getOutputStream());
    int r;
    while ((r = file.read()) != -1) {
      data.write(r);

    }
    System.out.println("\nFiletranfer Completed");
    s.close();
    ss.close();
  }
}