package usecases;

import java.sql.PreparedStatement;
import management.DataManager;

@SuppressWarnings("ALL")
public class ChangeWeight extends DataManager {
    public static PreparedStatement changeWeight() {
        return DataManager.weight;
    }
}
