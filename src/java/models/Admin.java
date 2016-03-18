package models;
import helpers.Utils;
import java.sql.*;

public class Admin {
	private String Admin_id;
	private String Password;

    public String getAdmin_id() {
        return Admin_id;
    }

    public void setAdmin_id(String Admin_id) {
        this.Admin_id = Admin_id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
