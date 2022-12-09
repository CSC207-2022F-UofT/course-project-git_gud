package management;

import java.sql.*;
import controllers.DashboardController;

@SuppressWarnings("ALL")
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
            /** TODO
             Change TEST to whatever your chosen table name is. Change this is every location you see it.
             */
            email = DashboardController.connection1.prepareStatement(
                    "UPDATE TEST SET email = ? WHERE email = ?");
            password = DashboardController.connection1.prepareStatement(
                    "UPDATE TEST SET password = ? WHERE password = ?");
            username = DashboardController.connection1.prepareStatement(
                    "UPDATE TEST SET username = ? WHERE username = ?");
            weight = DashboardController.connection1.prepareStatement(
                    "UPDATE TEST SET bodyweight = ? WHERE username = ?");
            fat = DashboardController.connection1.prepareStatement(
                    "UPDATE TEST SET bodyfat = ? WHERE username = ?");
            delete = DashboardController.connection1.prepareStatement("DELETE FROM TEST WHERE username=?");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
