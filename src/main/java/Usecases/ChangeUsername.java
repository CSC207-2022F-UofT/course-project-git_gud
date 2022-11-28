package Usecases;

import java.sql.PreparedStatement;
import management.DataManager;

public class ChangeUsername extends DataManager {
    public static PreparedStatement changeUsername() {
        return DataManager.username;
    }
}
