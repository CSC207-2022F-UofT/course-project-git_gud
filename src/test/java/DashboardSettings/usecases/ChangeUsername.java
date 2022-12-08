package DashboardSettings.usecases;

import management.DataManager;

import java.sql.PreparedStatement;

public class ChangeUsername extends DataManager {
    public static PreparedStatement changeUsername() {
        return DataManager.username;
    }
}
