package DashboardSettings;

import controllers.DashboardController;
import org.junit.jupiter.api.Test;
import usecases.dashboardsettings.DeleteAccount;

import java.sql.*;
import static controllers.DashboardController.connection1;
import static org.junit.jupiter.api.Assertions.*;

class DashboardControllerTest {
    @Test
    void deleteAccountUseCase() throws SQLException {
        //create new account with username, password, and email
        PreparedStatement newAccount = connection1.prepareStatement("INSERT into " +
                "dashtest(username, password, email)" + "VALUES (?, ?, ?)");
        newAccount.setString(1, "testusername");
        newAccount.setString(2, "testpassword");
        newAccount.setString(3, "testemail");
        newAccount.executeUpdate();

        //delete the user from the sql table
        PreparedStatement resultDelete = DeleteAccount.deleteAccount();
        resultDelete.setString(1, "testusername");
        resultDelete.executeUpdate();

        //test if the user exists in the table
        PreparedStatement existsRow = connection1.prepareStatement("SELECT EXISTS(" +
                "Select * FROM dashtest WHERE username = ?)");
        existsRow.setString(1, "testusername");
        int capturedOutput = existsRow.executeQuery().getRow();

        //check if the user still exists, sql returns a 1 for the user existing and 0 if it doesn't, so we
        //assertNotEquals here
        assertNotEquals(1, capturedOutput);
    }

    @Test
    void changeEmailUseCase() throws SQLException {
        //create new account with username, password, and email
        PreparedStatement newAccount = connection1.prepareStatement("INSERT into " +
                "dashtest(username, password, email)" + "VALUES (?, ?, ?)");
        newAccount.setString(1, "testusername");
        newAccount.setString(2, "testpassword");
        newAccount.setString(3, "testemail");
        newAccount.executeUpdate();

        //change the new account's email information to test the usecase
        String oldEmail = "testemail";
        String newEmail = "newemail";
        DashboardController.changeEmailUseCase(oldEmail, newEmail);

        //select the row in the table where the new user is located
        PreparedStatement p = connection1.prepareStatement("Select * FROM dashtest WHERE username = ?");
        p.setString(1, "testusername");

        //grab the email of the user after updates have been made and assert with its expected value
        ResultSet rs = p.executeQuery();
        rs.next();
        String grabEmail = rs.getString("email");
        PreparedStatement resultDelete = DeleteAccount.deleteAccount();
        resultDelete.setString(1, "testusername");
        resultDelete.executeUpdate();

        assertEquals("newemail", grabEmail);
    }

    @Test
    void changeUsernameUseCase() throws SQLException {
        //create new account with username, password, and email
        PreparedStatement newAccount = connection1.prepareStatement("INSERT into " +
                "dashtest(username, password, email)" + "VALUES (?, ?, ?)");
        newAccount.setString(1, "testusername");
        newAccount.setString(2, "testpassword");
        newAccount.setString(3, "testemail");
        newAccount.executeUpdate();

        //change the new account's username information to test the usecase
        String oldUsername = "testusername";
        String newUsername = "newusername";
        DashboardController.changeUsernameUseCase(oldUsername, newUsername);

        //select the row in the table where the new user is located
        PreparedStatement p = connection1.prepareStatement("Select * FROM dashtest WHERE email = ?");
        p.setString(1, "testemail");

        //grab the username of the user after updates have been made and assert with its expected value
        ResultSet rs = p.executeQuery();
        rs.next();
        String grabUsername = rs.getString("username");
        PreparedStatement resultDelete = DeleteAccount.deleteAccount();
        resultDelete.setString(1, "newusername");
        resultDelete.executeUpdate();

        assertEquals("newusername", grabUsername);
    }

    @Test
    void changePasswordUseCase() throws SQLException {
        //create new account with username, password, and email
        PreparedStatement newAccount = connection1.prepareStatement("INSERT into " +
                "dashtest(username, password, email)" + "VALUES (?, ?, ?)");
        newAccount.setString(1, "testusername");
        newAccount.setString(2, "testpassword");
        newAccount.setString(3, "testemail");
        newAccount.executeUpdate();

        //change the new account's password information to test the usecase
        String oldPassword = "testpassword";
        String newPassword = "newpassword";
        DashboardController.changePasswordUseCase(oldPassword, newPassword);

        //select the row in the table where the new user is located
        PreparedStatement p = connection1.prepareStatement("Select * FROM dashtest WHERE username = ?");
        p.setString(1, "testusername");

        //grab the password of the user after updates have been made and assert with its expected value
        ResultSet rs = p.executeQuery();
        rs.next();
        String grabPassword = rs.getString("password");
        PreparedStatement resultDelete = DeleteAccount.deleteAccount();
        resultDelete.setString(1, "testusername");
        resultDelete.executeUpdate();

        assertEquals("newpassword", grabPassword);
    }

    @Test
    void changeBodyWeightUseCase() throws SQLException {
        //create new account with username, password, and email
        PreparedStatement newAccount = connection1.prepareStatement("INSERT into " +
                "dashtest(username, password, email)" + "VALUES (?, ?, ?)");
        newAccount.setString(1, "testusername");
        newAccount.setString(2, "testpassword");
        newAccount.setString(3, "testemail");
        newAccount.executeUpdate();

        //change the new account's password information to test the usecase
        String username1 = "testusername";
        int weight = 1500;
        DashboardController.changeBodyWeightUseCase(username1, weight);

        //select the row in the table where the new user is located
        PreparedStatement p = connection1.prepareStatement("Select * FROM dashtest WHERE username = ?");
        p.setString(1, "testusername");

        //grab the bodyweight of the user after updates have been made and assert with its expected value
        ResultSet rs = p.executeQuery();
        rs.next();
        int grabWeight = rs.getInt("bodyweight");
        PreparedStatement resultDelete = DeleteAccount.deleteAccount();
        resultDelete.setString(1, "testusername");
        resultDelete.executeUpdate();

        assertEquals(1500, grabWeight);
    }

    @Test
    void changeBodyFatUseCase() throws SQLException {
        //create new account with username, password, and email
        PreparedStatement newAccount = connection1.prepareStatement("INSERT into " +
                "dashtest(username, password, email)" + "VALUES (?, ?, ?)");
        newAccount.setString(1, "testusername");
        newAccount.setString(2, "testpassword");
        newAccount.setString(3, "testemail");
        newAccount.executeUpdate();

        //change the new account's password information to test the usecase
        String username2 = "testusername";
        int fat = 1500;
        DashboardController.changeBodyFatUseCase(username2, fat);

        //select the row in the table where the new user is located
        PreparedStatement p = connection1.prepareStatement("Select * FROM dashtest WHERE username = ?");
        p.setString(1, "testusername");

        //grab the username of the user after updates have been made and assert with its expected value
        ResultSet rs = p.executeQuery();
        rs.next();
        int grabFat = rs.getInt("bodyfat");
        PreparedStatement resultDelete = DeleteAccount.deleteAccount();
        resultDelete.setString(1, "testusername");
        resultDelete.executeUpdate();

        assertEquals(1500, grabFat);
    }
}