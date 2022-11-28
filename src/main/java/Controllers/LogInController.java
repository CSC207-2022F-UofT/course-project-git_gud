/**
 * This is a main controller class that handles inputs and changes made by the user
 * in the UI, and determines which use case method to call
 */
package Controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Views.ViewLoginPage;
import Usecases.UseCaseFalseLogin;
import Usecases.UseCaseLogin;
import Usecases.UseCaseRegister;

public class LogInController {
    /**
     * The Controller for the loginButton takes in inputs from the text fields
     * of the given UI page, and determine which use case to select.
     */
    public static void loginButton(ViewLoginPage page) {
        String username = page.usernameField.getText();
        String password = String.valueOf(page.passwordField.getPassword());

        if(existsInDatabase(username)){
            if(passwordCorrectness(password)){
                UseCaseLogin.login(page);
            }
            else{
                UseCaseFalseLogin.falseLogin(page);
            }
        }
        else{
            UseCaseRegister.pleaseSignup(page);
        }
    }

    /**
     * The Controller for the signupButton takes in inputs from the text fields
     * of the given UI page, and determine which use case to select.
     */
    public static void signupButton(ViewLoginPage page){
        String username = page.usernameField.getText();
        String password = String.valueOf(page.passwordField.getPassword());
        String email = page.emailField.getText();

        if(existsInDatabase(username)){
            UseCaseRegister.usernameExists(page);
        }
        else{
            UseCaseRegister.newUser(username, password, email);
            UseCaseRegister.Registered(page);
        }
    }

    /**
     * This method determine whether the given input from the UI to the username
     * text field exists in the database
     *
     */
    public static Boolean existsInDatabase(String username){
        try {
            /** TODO
             Change the connection variable to match your personal database, localhost should be fine to leave,
             JDBCT should be changed to JDBC or whatever you setup the database as, user and password
             should be what you initially setup with your workbench program.
             Change dashtest to whatever your chosen table name is. Change this is every location you see it.
             */
            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBCT?allowMultiQueries=true", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From dashtest");//USER for Adrian's comp

            while (resultSet.next()) {
                if (resultSet.getString(1).equals(username)){
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
            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBCT?allowMultiQueries=true", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From dashtest");//USER for Adrian's comp
            while (resultSet.next()) {
                if (resultSet.getString(2).equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}