/**
 * This is a main controller class that handles inputs and changes made by the user
 * in the UI, and determines which use case method to call
 */
package controllers;
import java.sql.*;

import views.ViewLoginPage;
import usecases.UseCaseFalseLogin;
import usecases.UseCaseLogin;
import usecases.UseCaseRegister;

public class LogInController {

    /**
     * The Controller for the loginButton takes in inputs from the text fields
     * of the given UI page, and determine which use case to select.
     */
    public void loginButton(ViewLoginPage page) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
//        Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/JDBCT?allowMultiQueries=true", "root", "root");
        String username = page.usernameField.getText();
        String password = String.valueOf(page.passwordField.getPassword());

        if(existsInDatabase(username, connection, "dashtest")){
            if(passwordCorrectness(password, connection, "dashtest")){
                UseCaseLogin login = new UseCaseLogin();
                login.login(page);
            }
            else{
                UseCaseFalseLogin login = new UseCaseFalseLogin();
                login.falseLogin(page);
            }
        }
        else{
            UseCaseRegister register = new UseCaseRegister();
            register.pleaseSignup(page);
        }
    }

    /**
     * The Controller for the signupButton takes in inputs from the text fields
     * of the given UI page, and determine which use case to select.
     */
    public void signupButton(ViewLoginPage page) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/JDBCT?allowMultiQueries=true", "root", "root");
        String username = page.usernameField.getText();
        String password = String.valueOf(page.passwordField.getPassword());
        String email = page.emailField.getText();

        if(existsInDatabase(username, connection, "dashtest")){
            UseCaseRegister register = new UseCaseRegister();
            register.usernameExists(page);
        }
        else{
            UseCaseRegister register = new UseCaseRegister();
            register.newUser(username, password, email, connection, "dashtest");
            register.Registered(page);
        }
    }

    /**
     * This method determine whether the given input from the UI to the username
     * text field exists in the database
     *
     */
    public Boolean existsInDatabase(String username, Connection connection, String tableName){
        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From " + tableName);//USER for Adrian's comp

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
    public Boolean passwordCorrectness(String password, Connection connection, String tableName){
        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/JDBCT?allowMultiQueries=true", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * From " + tableName);//USER for Adrian's comp
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