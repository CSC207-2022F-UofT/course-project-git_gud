package usecases.dashboardsettings;

import management.DataManager;

import java.sql.PreparedStatement;

public class ChangeWeight extends DataManager {
    public static PreparedStatement changeWeight() {
        return DataManager.weight;
    }
}
