package DashboardSettings.usecases;

import management.DataManager;

import java.sql.PreparedStatement;

public class DeleteAccount extends DataManager {
    public static PreparedStatement deleteAccount() {
        return DataManager.delete;
    }
}
