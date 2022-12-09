package usecases;

import management.DataManager;

import java.sql.PreparedStatement;

@SuppressWarnings("ALL")
public class ChangeEmail extends DataManager {
    public static PreparedStatement changeEmail() {
        return DataManager.email;
    }
}
