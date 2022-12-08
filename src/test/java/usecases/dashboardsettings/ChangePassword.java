package usecases.dashboardsettings;

import management.DataManager;

import java.sql.PreparedStatement;

public class ChangePassword extends DataManager {
    public static PreparedStatement changePassword() {
        return DataManager.password;
    }
}
