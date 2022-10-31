package tutorial;

import javax.swing.plaf.nimbus.State;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

public class SQL {
    public static void main(String[] args) throws IOException, SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/UserDB";
        String username = "root";
        String password = "password";
        String excelFilePath = "Students.xlsx";

        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        String sql = "INSERT INTO..";
        Statement statement = connection.createStatement();

        int rows = statement.executeUpdate(sql);
    }
}
