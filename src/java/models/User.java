
package models;
import helpers.Utils;
import java.sql.*;

public class User {
private String UserId;
private String EmailId;
private String Password;
private String Name;
private String Address;
private String State;
private String MobileNumber;
private String EmployeeName;
private String EmployeeId;


public static int InsertUser(User u) throws Exception
{
    int x=0;
          Class.forName(Utils.driver);
          Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
          PreparedStatement ps=con.prepareStatement("insert into User (UserId,EmailId,Password,Name,Address,State,MobileNumber) values(?,?,?,?,?,?,?)");
          ps.setString(1, u.getUserId());
          ps.setString(2, u.getEmailId());
          ps.setString(3, u.getPassword());
          ps.setString(4, u.getName());
          ps.setString(5, u.getAddress());
          ps.setString(6, u.getState());
          ps.setString(7, u.getMobileNumber());
          x=ps.executeUpdate();
      return(x);
}
 public static int UpdateUser(User u)
 {
    int x=0;
      try
      {
          Class.forName(Utils.driver);
          Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
          PreparedStatement ps=con.prepareStatement("Update User set (EmailId,Password,Name,Address,State,MobileNumber) values(?,?,?,?,?,?,?) where UserId=54");
          ps.setString(1, u.getEmailId());
          ps.setString(2, u.getPassword());
          ps.setString(3, u.getName());
          ps.setString(4, u.getAddress());
          ps.setString(5, u.getState());
          ps.setString(6, u.getMobileNumber());
         x=ps.executeUpdate();

      }
      catch(Exception ex)
      {

      }
      return(x);
 }
  public static boolean signin(User u)
    {
     boolean x=false;
      try
      {
          Class.forName(Utils.driver);
          Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
          PreparedStatement ps=con.prepareStatement ("select * from User where UserId =? and Password=?");
          ps.setString(1, u.getUserId());
          ps.setString(2, u.getPassword());
          ResultSet rs=ps.executeQuery();
          if(rs.next())
          {
            x=true;
          }

      }
      catch(Exception ex)
      {

      }
      return(x);
    }
public static User details(String user)
{
    User u=new User();
    try
    {
        Class.forName(Utils.driver);
          Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
          PreparedStatement ps=con.prepareStatement("select * from User where worker_id ="+user);
          ResultSet rs=ps.executeQuery();

          u.setAddress(rs.getString(1));

    }
    catch(Exception ex)
    {

    }
    return(u);
}

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public String getPassword() {
        return Password;
    }

   
    public void setPassword(String Password) {
        this.Password = Password;
    }

   
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }
}
