package Settings;

import java.sql.PreparedStatement;
import Management.Data_Manager;

public class Change_Fat {
    public static PreparedStatement ChangeFat() {
        return Data_Manager.Fat;
    }
}
