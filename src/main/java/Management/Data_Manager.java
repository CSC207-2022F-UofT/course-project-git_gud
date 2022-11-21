package Management;

import java.sql.*;
import Controllers.DashboardController;

public class Data_Manager {
    /***
     * Data_Manager is a class that
     */
    public static PreparedStatement email;
    protected static PreparedStatement username;
    protected static PreparedStatement password;
    public static PreparedStatement weight;
    public static PreparedStatement fat;
    public static PreparedStatement delete;

    static {
        try {
            /** TODO
             Change dashtest to whatever your chosen table name is. Change this is every location you see it.
             */
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
