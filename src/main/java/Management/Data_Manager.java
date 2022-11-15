package Management;

import java.sql.*;
import Controllers.DashboardController;

public class Data_Manager {
    protected static PreparedStatement email;
    protected static PreparedStatement username;
    protected static PreparedStatement password;
    public static PreparedStatement Weight;
    public static PreparedStatement Fat;

    static {
        try {
            email = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET email = ? WHERE email = ?");
            password = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET password = ? WHERE password = ?");
            username = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET username = ? WHERE username = ?");
            Weight = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET bodyweight = ? WHERE bodyweight = ?");
            Fat = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET bodyfat = ? WHERE bodyfat = ?");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
