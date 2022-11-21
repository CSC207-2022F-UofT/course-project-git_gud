package Usecases;

import java.sql.PreparedStatement;
import Management.Data_Manager;

public class Change_Fat extends Data_Manager{
    /**
     * Change_Fat returns the prepared statement for fat in data_manager
     * @return a prepared statement
     */
    public static PreparedStatement ChangeFat() {
        return Data_Manager.fat;
    }
}
