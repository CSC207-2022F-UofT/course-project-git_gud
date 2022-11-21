package Usecases;

import java.sql.PreparedStatement;
import Management.Data_Manager;

public class Change_Fat extends Data_Manager{
    public static PreparedStatement ChangeFat() {
        return Data_Manager.fat;
    }
}
