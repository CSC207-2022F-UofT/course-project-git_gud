import javax.swing.text.View;
import java.sql.*;

public class UseCaseRegister {
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
    public static void pleaseSignup(ViewLoginPage x){
        Presenter.pleaseSignup(x);
    }
    public static void Registered(ViewLoginPage x){
        Presenter.completeRegistration(x);
    }

    public static void usernameExists(ViewLoginPage x){
        Presenter.usernameExists(x);
    }

}
