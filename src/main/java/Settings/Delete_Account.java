package Settings;

import java.sql.*;

public class Delete_Account {
    public static PreparedStatement Delete(Connection connection1) throws SQLException {
        return connection1.prepareStatement(
                "DELETE FROM dashtest WHERE username=?");
    }
}
