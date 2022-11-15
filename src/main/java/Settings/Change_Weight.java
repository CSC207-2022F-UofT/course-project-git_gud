package Settings;

import java.sql.PreparedStatement;
import Management.Data_Manager;

public class Change_Weight {
    public static PreparedStatement ChangeWeight() {
        return Data_Manager.Weight;
    }
}
