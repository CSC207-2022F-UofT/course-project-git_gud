package usecases;

import management.DataManager;
import java.sql.*;

public class DeleteAccount extends DataManager {
    public static PreparedStatement deleteAccount() {
        return DataManager.delete;
    }
}
