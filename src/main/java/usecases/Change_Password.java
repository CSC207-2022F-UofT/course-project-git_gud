package usecases;

import java.sql.PreparedStatement;
import management.Data_Manager;

public class Change_Password extends Data_Manager {
    public static PreparedStatement ChangePassword() {
        return Data_Manager.password;
    }
}
