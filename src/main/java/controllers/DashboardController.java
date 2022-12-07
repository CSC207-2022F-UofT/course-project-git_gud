package controllers;

import usecases.*;

import java.sql.*;

public class DashboardController {
    public static final Connection connection1;

    static {
        try {
            connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
//            connection1 = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/JDBCT?allowMultiQueries=true", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteAccountUseCase(String userName) throws SQLException {
        PreparedStatement resultDelete = DeleteAccount.deleteAccount();
        resultDelete.setString(1, userName);
        resultDelete.executeUpdate();
    }

    public static void changeEmailUseCase(String oldEmail, String newEmail) throws SQLException {
        PreparedStatement resultEmail = ChangeEmail.changeEmail();
        resultEmail.setString(1, newEmail);
        resultEmail.setString(2, oldEmail);
        resultEmail.executeUpdate();
    }

    public static void changeUsernameUseCase(String userName, String newUserName) throws SQLException {
        PreparedStatement resultUsername = ChangeUsername.changeUsername();
        resultUsername.setString(1, newUserName);
        resultUsername.setString(2, userName);
        resultUsername.executeUpdate();
    }

    public static void changePasswordUseCase(String oldPassword, String newPassword) throws SQLException {
        PreparedStatement resultPassword = ChangePassword.changePassword();
        resultPassword.setString(1, newPassword);
        resultPassword.setString(2, oldPassword);
        resultPassword.executeUpdate();
    }

    public static void changeBodyWeightUseCase(String username1, int newWeight) throws SQLException {
        PreparedStatement resultWeight = ChangeWeight.changeWeight();
        resultWeight.setInt(1, newWeight);
        resultWeight.setString(2, username1);
        resultWeight.executeUpdate();
    }

    public static void changeBodyFatUseCase(String username2, int newFat) throws SQLException {
        PreparedStatement resultFat = ChangeFat.changeFat();
        resultFat.setInt(1, newFat);
        resultFat.setString(2, username2);
        resultFat.executeUpdate();
    }
}