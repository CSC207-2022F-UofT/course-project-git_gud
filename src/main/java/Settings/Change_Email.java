package Settings;

import Management.Data_Manager;

import java.sql.PreparedStatement;

public class Change_Email  {
    public static PreparedStatement ChangeEmail() {
        return Data_Manager.email;
    }
}
