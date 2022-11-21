package Usecases;

import java.sql.PreparedStatement;
import Management.Data_Manager;

public class Change_Username extends Data_Manager {
    /**
     * Change_Username returns the prepared statement for username in data_manager
     * @return a prepared statement
     */
    public static PreparedStatement ChangeUsername() {
        return Data_Manager.username;
    }
}
