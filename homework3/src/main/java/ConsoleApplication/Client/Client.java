package ConsoleApplication.Client;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        Socket socket = null;

        final String ipAddress = "localhost";
        final int port = 8189;

        try {
            socket = new Socket(ipAddress, port);

            Message message = new Message("client", "Hello, Server!");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mess.ser"));
            oos.writeObject(message);
            oos.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


