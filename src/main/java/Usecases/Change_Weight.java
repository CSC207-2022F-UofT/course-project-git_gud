package Usecases;

import java.sql.PreparedStatement;
import Management.Data_Manager;

public class Change_Weight extends Data_Manager {
    /**
     * Change_Weight returns the prepared statement for weight in data_manager
     * @return a prepared statement
     */
    public static PreparedStatement ChangeWeight() {
        return Data_Manager.weight;
    }
}
