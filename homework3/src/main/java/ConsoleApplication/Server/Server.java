package ConsoleApplication.Server;

import ConsoleApplication.Client.Message;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws ClassNotFoundException {

        ServerSocket server = null;
        Socket socket = null;

        try {
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен!");

            socket = server.accept();
            System.out.println("Клиент подключился");

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mess.ser"));
            Message mass2 = (Message) ois.readObject();
            ois.close();
            mass2.info();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
