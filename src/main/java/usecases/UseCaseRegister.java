/**
 * This class Registers the user
 */
package usecases;
import presenter.Presenter;
import java.sql.*;
import entity.EntitiyAppUser;
import ui.ViewLoginPage;

public class UseCaseRegister {
    /**
     * This method instantiates a new EntityAppUser as well as add this new user into the Database Entity.
     */
    public static void newUser(String username, String password, String email) {
        EntitiyAppUser x = new EntitiyAppUser(username, password, email);
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
            String SQL = "INSERT into USER(username, password, email)" + "VALUES (?, ?, ?)";
            PreparedStatement p = connection.prepareStatement(SQL);
            p.setString(1, x.getUsername());
            p.setString(2, x.getPassword());
            p.setString(3, x.getEmail());
            p.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method calls the pleaseSignup method from the presenter class if the user clicks log in but isn't in the system
     */
    public static void pleaseSignup(ViewLoginPage x){
        Presenter.pleaseSignup(x);
    }

    /**
     * This method calls the completeRegistration method from the presenter class after the user finishes signing up
     */
    public static void Registered(ViewLoginPage x){
        Presenter.completeRegistration(x);
    }

    /**
     * This method calls the usernameExists method from the presenter class if the username already exists when the user try signing up
     */
    public static void usernameExists(ViewLoginPage x){
        Presenter.usernameExists(x);
    }

}
