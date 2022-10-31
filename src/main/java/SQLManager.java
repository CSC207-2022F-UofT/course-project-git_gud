import java.sql.*;

public class SQLManager {
    //tablename = UserInformation ?
    //    ajfiojsaidoiajfs
    static Connection database;

    static {
        try {
            database = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public SQLManager() throws SQLException {
    }

    public static boolean viewTable(Connection con) throws SQLException {
        String query = "select ID, USERNAME, PASSWORD, EMAIL, BODYFAT, WEIGHT from USERINFORMATION";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String username = rs.getString("USERNAME");
                int ID = rs.getInt("ID");
                String password = rs.getString("PASSWORD");
                String email = rs.getString("EMAIL");
                int weight = rs.getInt("WEIGHT");
                int bodyFat = rs.getInt("BODYFAT");
                System.out.println(username + ", " + ID + ", " + password +
                        ", " + email + ", " + weight + ", " + bodyFat);
            }
        } catch (SQLException e) {
            //SQL Exception
        }
        return false;
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(viewTable(database));
    }
}
