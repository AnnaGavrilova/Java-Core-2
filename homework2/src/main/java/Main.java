import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DB.connect();
        DB.clearDB();
        DB.addValues();
        DB.disconnect();
    }
}
