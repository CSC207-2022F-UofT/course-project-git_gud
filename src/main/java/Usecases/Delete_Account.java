package Usecases;

import Management.Data_Manager;
import java.sql.*;

public class Delete_Account extends Data_Manager {
    /**
     * Delete_Account returns the prepared statement for delete in data_manager
     * @return a prepared statement
     */
    public static PreparedStatement DeleteAccount() {
        return Data_Manager.delete;
    }
}
