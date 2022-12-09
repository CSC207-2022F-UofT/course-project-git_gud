package loginSystem;
import com.mysql.cj.log.Log;
import controllers.LogInController;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


import java.sql.*;

public class ControllerTest {
    private final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");

    public ControllerTest() throws SQLException {
    }
    @BeforeEach
    public void setup() throws SQLException {
        String SQL = "INSERT into TEST(username, password, email)" + "VALUES (?, ?, ?)";
        PreparedStatement p = connection.prepareStatement(SQL);
        p.setString(1, "testUSER");
        p.setString(2, "testPassword");
        p.setString(3, "testEmail");
        p.executeUpdate();
    }
    @Test
    public void controllerExistsInDatabaseTest1(){
        LogInController testcontroller = new LogInController();
        Assertions.assertEquals(true, testcontroller.existsInDatabase("testUSER", connection, "TEST"));
    }
    @Test
    public void controllerExistsInDatabaseTest2(){
        LogInController testcontroller = new LogInController();
        Assertions.assertEquals(false, testcontroller.existsInDatabase("testUSER2", connection, "TEST"));
    }
    @Test
    public void passwordCorrectnessTest1(){
        LogInController testcontroller = new LogInController();
        Assertions.assertEquals(true,testcontroller.passwordCorrectness("testPassword", connection, "TEST"));
    }
    @Test
    public void passwordCorrectnessTest2(){
        LogInController testcontroller = new LogInController();
        Assertions.assertEquals(false,testcontroller.passwordCorrectness("testPassword2", connection, "TEST"));
    }
    @AfterEach
    public void dismantle() throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "TRUNCATE TEST";
        statement.executeUpdate(sql);
    }
}
