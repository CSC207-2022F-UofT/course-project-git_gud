package usecases;

import management.Data_Manager;
import java.sql.*;

public class Delete_Account extends Data_Manager {
    public static PreparedStatement DeleteAccount() {
        return Data_Manager.delete;
    }
}
