package usecases;

import java.sql.PreparedStatement;
import management.Data_Manager;

public class Change_Fat extends Data_Manager{
    public static PreparedStatement ChangeFat() {
        return Data_Manager.fat;
    }
}
