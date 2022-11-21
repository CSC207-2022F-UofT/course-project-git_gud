package Usecases;

import java.sql.PreparedStatement;
import Management.Data_Manager;

public class Change_Password extends Data_Manager {
    /**
     * Change_Password returns the prepared statement for password in data_manager
     * @return a prepared statement
     */
    public static PreparedStatement ChangePassword() {
        return Data_Manager.password;
    }
}
