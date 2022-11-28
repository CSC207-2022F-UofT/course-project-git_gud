package Usecases;

import java.sql.PreparedStatement;
import management.DataManager;

public class ChangeWeight extends DataManager {
    public static PreparedStatement changeWeight() {
        return DataManager.weight;
    }
}
