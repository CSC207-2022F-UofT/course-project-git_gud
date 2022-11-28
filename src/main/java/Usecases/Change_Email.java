package Usecases;

import Management.Data_Manager;

import java.sql.PreparedStatement;

public class Change_Email extends Data_Manager{
    public static PreparedStatement ChangeEmail() {
        return Data_Manager.email;
    }
}
