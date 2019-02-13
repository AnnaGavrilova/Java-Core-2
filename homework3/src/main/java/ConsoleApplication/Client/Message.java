package ConsoleApplication.Client;

import java.io.Serializable;

public class Message implements Serializable {
    String nick;
    String text;

    public Message(String nick, String text) {
        this.nick = nick;
        this.text = text;
    }

    public void info() {

        System.out.println(nick + ": " + text);
    }
}
