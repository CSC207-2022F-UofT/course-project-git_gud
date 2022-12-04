package usecases.dashboardsettings;

import management.DataManager;

import java.sql.PreparedStatement;

public class ChangeFat extends DataManager {
    public static PreparedStatement changeFat() {
        return DataManager.fat;
    }
}
