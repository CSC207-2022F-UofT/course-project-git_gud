package loginSystem;

import controllers.LogInController;
import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import usecases.UseCaseRegister;
import static org.junit.Assert.assertEquals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UseCaseRegisterTest {

    private final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");

    public UseCaseRegisterTest() throws SQLException {
    }
    @Test
    void UseCaseRegisterNewUserTest() {
        LogInController testcontroller = new LogInController();
        UseCaseRegister testRegister = new UseCaseRegister();

        testRegister.newUser("USER123", "USERPASSWORD", "@gmail.com", connection, "TEST");
        Assertions.assertEquals(true, testcontroller.existsInDatabase("USER123", connection, "TEST" ));
    }
    @After
    public void dismantle() throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "TRUNCATE TEST";
        statement.executeUpdate(sql);
    }
}