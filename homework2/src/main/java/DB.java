import java.sql.*;

public class DB {
    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:dataHW2.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() throws ClassNotFoundException, SQLException {
        connection.close();
    }

    public static void createNewTable() throws SQLException {
        stmt.executeQuery("CREATE TABLE IF NOT EXISTS products (\n" +
                "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    prodid   TEXT UNIQUE,\n" +
                "    title  TEXT,\n" +
                "    cost INTEGER\n" +
                ");\n");
    }

    public static void clearDB() throws SQLException {
        stmt.executeUpdate("DELETE FROM products");
    }

    public static void addValues() throws SQLException {
        pstmt = connection.prepareStatement("INSERT INTO products (prodid, title, cost)\n" +
                "VALUES (?, ?, ?)");

        connection.setAutoCommit(false);

        for (int i = 1; i <= 10000; i++) {
            pstmt.setString(1, "id_товара " + i);
            pstmt.setString(2, "товар " + i);
            pstmt.setInt(3, +(i * 10));
            pstmt.addBatch();
        }

        pstmt.executeBatch();
        connection.setAutoCommit(true);
    }
}
