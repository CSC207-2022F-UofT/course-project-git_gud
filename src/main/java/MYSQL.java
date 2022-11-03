import java.sql.*;

public class MYSQL {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from USER");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
