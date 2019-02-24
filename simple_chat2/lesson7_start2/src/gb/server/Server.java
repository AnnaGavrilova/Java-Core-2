package gb.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.*;

public class Server {
    private Vector<ClientHandler> clients;
    private static final Logger logger = Logger.getLogger("");

    public Server() throws SQLException, IOException {
        clients = new Vector<>();
        ServerSocket server = null;
        Socket socket = null;
        createLog();
        try {
            AuthService.connect();
            server = new ServerSocket(8189);
            logger.log(Level.INFO, "Сервер запущен. Ожидаем клиентов...");
            System.out.println("Сервер запущен. Ожидаем клиентов...");
            while (true) {
                socket = server.accept();
                System.out.println("Клиент подключился");
                new ClientHandler(this, socket);

            }
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
            AuthService.disconnect();
        }
    }

    public void subscribe(ClientHandler client) {
        logger.log(Level.INFO, "Клиент подключился");
        clients.add(client);
    }

    public void unsubscribe(ClientHandler client) {
        clients.remove(client);
    }


    public void broadcastMsg(String msg) {
        for (ClientHandler o : clients) {
            o.sendMsg(msg);
        }
    }

    public void createLog() throws IOException {
        logger.setLevel(Level.INFO);
        Handler handler = new FileHandler("mylog.log");
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
    }
}
