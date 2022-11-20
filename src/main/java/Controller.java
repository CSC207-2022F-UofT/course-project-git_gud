import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    public static void Verify(ViewLoginPage page) {
        String username = page.usernameField.getText();
        String password = String.valueOf(page.passwordField.getPassword());
        String email = page.emailField.getText();

        if(existsInDatabase(username, password, email)){
            if(passwordCorrectness(password)){
                UseCaseLogin.login(page);
            }
            else{
                UseCaseFalseLogin.falseLogin(page);
            }
        }
        else{
            UseCaseRegister.newUser(username, password, email);
            UseCaseRegister.Registered(page);
        }
    }
    public static Boolean existsInDatabase(String username, String password, String email){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select username from USER");

            while (resultSet.next()) {
                if (resultSet.equals(username)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static Boolean passwordCorrectness(String password){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select password from USER");
            while (resultSet.next()) {
                if (resultSet.equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}