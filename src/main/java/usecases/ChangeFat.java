package usecases;

import java.sql.PreparedStatement;
import management.DataManager;

@SuppressWarnings("ALL")
public class ChangeFat extends DataManager {
    public static PreparedStatement changeFat() {
        return DataManager.fat;
    }
}
