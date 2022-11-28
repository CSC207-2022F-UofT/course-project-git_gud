package management;

import java.sql.*;
import Controllers.DashboardController;

public class DataManager {
    /***
     * Data_Manager is a class that
     */
    public static final PreparedStatement email;
    protected static final PreparedStatement username;
    protected static final PreparedStatement password;
    public static final PreparedStatement weight;
    public static final PreparedStatement fat;
    public static final PreparedStatement delete;

    static {
        try {
            email = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET email = ? WHERE email = ?");
            password = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET password = ? WHERE password = ?");
            username = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET username = ? WHERE username = ?");
            weight = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET bodyweight = ? WHERE username = ?");
            fat = DashboardController.connection1.prepareStatement(
                    "UPDATE dashtest SET bodyfat = ? WHERE username = ?");
            delete = DashboardController.connection1.prepareStatement("DELETE FROM dashtest WHERE username=?");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
