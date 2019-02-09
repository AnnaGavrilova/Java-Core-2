import java.sql.SQLException;

public class CreateTable {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DB.connect();

        DB.createNewTable();

        DB.disconnect();
    }
}
