package Usecases;

import java.sql.PreparedStatement;
import management.DataManager;

public class ChangeFat extends DataManager {
    public static PreparedStatement changeFat() {
        return DataManager.fat;
    }
}
