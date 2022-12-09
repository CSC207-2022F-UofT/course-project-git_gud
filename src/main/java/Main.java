//import views.ViewLoginPage;
import views.dashboard.SettingsPage;

import java.sql.SQLException;

public class Main{

    public static void main(String[] args) throws SQLException {
        SettingsPage settings = new SettingsPage();
        settings.CreateSettingsPage(null);
    }
}




