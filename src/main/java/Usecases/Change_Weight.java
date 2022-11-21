package Usecases;

import java.sql.PreparedStatement;
import Management.Data_Manager;

public class Change_Weight extends Data_Manager {
    public static PreparedStatement ChangeWeight() {
        return Data_Manager.weight;
    }
}
