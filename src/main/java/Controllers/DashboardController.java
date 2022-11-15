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

    public static String ChangeEmailUseCase(String oldEmail, String newEmail) throws SQLException {
        PreparedStatement resultEmail = Change_Email.ChangeEmail();
        resultEmail.setString(1, newEmail);
        resultEmail.setString(2, oldEmail);
        resultEmail.executeUpdate();
        return "Account email: " + oldEmail + " has been successfully changed to " + newEmail;
    }

    public static String ChangeUsernameUseCase(String userName, String newUserName) throws SQLException {
        PreparedStatement resultUsername = Change_Username.ChangeUsername();
        resultUsername.setString(1, newUserName);
        resultUsername.setString(2, userName);
        resultUsername.executeUpdate();
        return "Account username: " + userName + " has been successfully changed to " + newUserName;
    }

    public static String ChangePasswordUseCase(String oldPassword, String newPassword) throws SQLException {
        PreparedStatement resultPassword = Change_Password.ChangePassword();
        resultPassword.setString(1, newPassword);
        resultPassword.setString(2, oldPassword);
        resultPassword.executeUpdate();
        return "Account password has been successfully changed";
    }

    public static String ChangeBodyWeightUseCase(int oldWeight, int newWeight) throws SQLException {
        PreparedStatement resultWeight = Change_Weight.ChangeWeight();
        resultWeight.setInt(1, newWeight);
        resultWeight.setInt(2, oldWeight);
        resultWeight.executeUpdate();
        return "Account BodyWeight: " + oldWeight + " been successfully changed to " + newWeight;
    }

    public static String ChangeBodyFatUseCase(int oldFat, int newFat) throws SQLException {
        PreparedStatement resultFat = Change_Fat.ChangeFat();
        resultFat.setInt(1, newFat);
        resultFat.setInt(2, oldFat);
        resultFat.executeUpdate();
        return "Account BodyWeight: " + oldFat + " been successfully changed to " + newFat;
    }
}
