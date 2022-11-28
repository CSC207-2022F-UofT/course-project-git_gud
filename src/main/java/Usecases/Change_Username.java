package Usecases;

import java.sql.PreparedStatement;
import Management.Data_Manager;

public class Change_Username extends Data_Manager {
    public static PreparedStatement ChangeUsername() {
        return Data_Manager.username;
    }
}
