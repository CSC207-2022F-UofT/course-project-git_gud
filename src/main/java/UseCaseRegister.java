import javax.swing.text.View;
import java.sql.*;

public class UseCaseRegister {
    public static void newUser(String username, String password, String email) {
        EntitiyAppUser x = new EntitiyAppUser(username, password, email);
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO USER" + "VALUES (?, ?, ?, ?)";
            PreparedStatement p = connection.prepareStatement(SQL);
            p.setString(1, x.getUsername());
            p.setString(2, x.getPassword());
            p.setString(3, x.getEmail());
            p.executeUpdate();
            p.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Registered(ViewLoginPage x){
        Presenter.completeRegistration(x);
    }

}
