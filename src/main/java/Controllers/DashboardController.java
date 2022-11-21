package Controllers;

import Usecases.*;

import java.sql.*;

public class DashboardController {
    /**
     * A controller class that handles the usecases for the dashboard. It calls upon usecase classes to perform
     * certain functions and make changes to the sql database
     */
    public static Connection connection1;

    static {
        try {
            /** TODO
             Change the connection variable to match your personal database, localhost should be fine to leave,
             JDBCT should be changed to JDBC or whatever you setup the database as, user and password
             should be what you initially setup with your workbench program.
             */
            connection1 = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBCT?allowMultiQueries=true", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void DeleteAccountUseCase(String userName) throws SQLException {
        /**
         * DeleteAccountUseCase will delete a user account from the SQL database
         */
        PreparedStatement resultDelete = Delete_Account.DeleteAccount();
        resultDelete.setString(1, userName);
        resultDelete.executeUpdate();
    }

    public static void ChangeEmailUseCase(String oldEmail, String newEmail) throws SQLException {
        /**
         * ChangeEmailUseCase will change the email of a user in the SQL database
         */
        PreparedStatement resultEmail = Change_Email.ChangeEmail();
        resultEmail.setString(1, newEmail);
        resultEmail.setString(2, oldEmail);
        resultEmail.executeUpdate();
    }

    public static void ChangeUsernameUseCase(String userName, String newUserName) throws SQLException {
        /**
         * ChangeUsernameUseCase will change the username for a use in the SQL database
         */
        PreparedStatement resultUsername = Change_Username.ChangeUsername();
        resultUsername.setString(1, newUserName);
        resultUsername.setString(2, userName);
        resultUsername.executeUpdate();
    }

    public static void ChangePasswordUseCase(String oldPassword, String newPassword, String username) throws SQLException {
        /**
         * ChangePasswordUseCase will change the password of a user in the SQL database
         */
        PreparedStatement resultPassword = Change_Password.ChangePassword();
        resultPassword.setString(1, newPassword);
        resultPassword.setString(2, oldPassword);
        resultPassword.setString(3, username);
        resultPassword.executeUpdate();
    }

    public static void ChangeBodyWeightUseCase(String username1, int newWeight) throws SQLException {
        /**
         * ChangeBodyWeightUseCase will change the weight stat of an associated user in the SQL database
         */
        PreparedStatement resultWeight = Change_Weight.ChangeWeight();
        resultWeight.setInt(1, newWeight);
        resultWeight.setString(2, username1);
        resultWeight.executeUpdate();
    }

    public static void ChangeBodyFatUseCase(String username2, int newFat) throws SQLException {
        /**
         * ChangeBodyFatUseCase will change the fat stat of an associated user in the SQL database
         */
        PreparedStatement resultFat = Change_Fat.ChangeFat();
        resultFat.setInt(1, newFat);
        resultFat.setString(2, username2);
        resultFat.executeUpdate();
    }
}
