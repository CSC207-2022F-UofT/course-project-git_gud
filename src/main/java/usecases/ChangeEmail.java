package usecases;

import management.DataManager;

import java.sql.PreparedStatement;

public class ChangeEmail extends DataManager {
    public static PreparedStatement changeEmail() {
        return DataManager.email;
    }
}
