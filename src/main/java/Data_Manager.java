import java.sql.*;
public class Data_Manager {
    public static void main(String[] args) {
        try {

            Connection connection1 = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/JDBCT?allowMultiQueries=true", "root", "root");
            Statement statement = connection1.createStatement();


            statement.executeUpdate("alter table DashTest add bodyweight int not null"); //code example to add a column

            PreparedStatement pstmt = connection1.prepareStatement(
                    //updates bodyfat1 column with values based on input to the corresponding username
                    "UPDATE DashTest SET bodyweight = ? where username = ?");
            pstmt.setInt(1, 90);
            pstmt.setString(2,"beast");
            pstmt.executeUpdate();

            ResultSet resultSet = statement.executeQuery("select * from DashTest"); //opens the table to viewing

            while (resultSet.next()) {
                System.out.println(resultSet.getRow());
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password"));
                System.out.println(resultSet.getString("bodyweight"));

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
