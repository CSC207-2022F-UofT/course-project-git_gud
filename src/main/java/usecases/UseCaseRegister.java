/**
 * This class Registers the user
 */
package usecases;
import presenters.Presenter;
import java.sql.*;
import entities.EntitiyAppUser;
import views.ViewLoginPage;

public class UseCaseRegister {
    /**
     * This method instantiates a new EntityAppUser as well as add this new user into the Database Entity.
     */
    public void newUser(String username, String password, String email) {
        EntitiyAppUser x = new EntitiyAppUser(username, password, email);
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
//            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/JDBCT?allowMultiQueries=true", "root", "root");
            String SQL = "INSERT into dashtest(username, password, email)" + "VALUES (?, ?, ?)";
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
    public void pleaseSignup(ViewLoginPage x){
        Presenter presenter = new Presenter();
        presenter.pleaseSignup(x);
    }

    /**
     * This method calls the completeRegistration method from the presenter class after the user finishes signing up
     */
    public void Registered(ViewLoginPage x){
        Presenter presenter = new Presenter();
        presenter.completeRegistration(x);
    }

    /**
     * This method calls the usernameExists method from the presenter class if the username already exists when the user try signing up
     */
    public void usernameExists(ViewLoginPage x){
        Presenter presenter = new Presenter();
        presenter.usernameExists(x);
    }

}
