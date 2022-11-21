package Controllers;

import Management.Settings;
import Settings.*;

import java.sql.*;

public class DashboardController extends Settings {
    public static Connection connection1;

    static {
        try {
            connection1 = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBCT?allowMultiQueries=true", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void LogOutUseCase(){
        //logout
        //return to login screen(Adrian's work)
    }

    public static String DeleteAccountUseCase(String userName) throws SQLException {
        //remove account data from database(username, associated password/email, associated stats)
        PreparedStatement resultDelete = Delete_Account.Delete(connection1);
        resultDelete.setString(1, userName);
        resultDelete.executeUpdate();

        return "Account " + userName + " was successfully deleted";
    }

    public static void ChangeEmailUseCase(String oldEmail, String newEmail) throws SQLException {
        PreparedStatement resultEmail = Change_Email.ChangeEmail();
        resultEmail.setString(1, newEmail);
        resultEmail.setString(2, oldEmail);
        resultEmail.executeUpdate();
    }

    public static void ChangeUsernameUseCase(String userName, String newUserName) throws SQLException {
        PreparedStatement resultUsername = Change_Username.ChangeUsername();
        resultUsername.setString(1, newUserName);
        resultUsername.setString(2, userName);
        resultUsername.executeUpdate();
    }

    public static void ChangePasswordUseCase(String oldPassword, String newPassword) throws SQLException {
        PreparedStatement resultPassword = Change_Password.ChangePassword();
        resultPassword.setString(1, newPassword);
        resultPassword.setString(2, oldPassword);
        resultPassword.executeUpdate();
        //return "Account password has been successfully changed";
    }

    public static void ChangeBodyWeightUseCase(String username1, int newWeight) throws SQLException {
        PreparedStatement resultWeight = Change_Weight.ChangeWeight();
        resultWeight.setInt(1, newWeight);
        resultWeight.setString(2, username1);
        resultWeight.executeUpdate();
        //return "Account BodyWeight: been successfully changed to " + newWeight;
    }

    public static void ChangeBodyFatUseCase(String username2, int newFat) throws SQLException {
        PreparedStatement resultFat = Change_Fat.ChangeFat();
        resultFat.setInt(1, newFat);
        resultFat.setString(2, username2);
        resultFat.executeUpdate();
        //return "Account BodyWeight: been successfully changed to " + newFat;
    }
}
