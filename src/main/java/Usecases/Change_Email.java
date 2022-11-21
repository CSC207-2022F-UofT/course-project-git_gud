package Usecases;

import Management.Data_Manager;

import java.sql.PreparedStatement;

public class Change_Email extends Data_Manager{
    /**
     * Change_Email returns the prepared statement for email in data_manager
     * @return a prepared statement
     */
    public static PreparedStatement ChangeEmail() {
        return Data_Manager.email;
    }
}
