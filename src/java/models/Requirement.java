package models;
import helpers.Utils;
import java.sql.*;

public class Requirement {

   private String OrganisationId;
   private String RequestNumber;
   private int NumberOfWorkers;
   private String Gender;
   private String WorkName;
   private String Wages_Mode;
   private String StatDate;
   private String EndDate;
   private String ReqAddress;
   private String City;
   private int WageRange;
 
    public static int InsertRequirement(Requirement r)
    {
          int x=0;
      try
      {
          int n=r.getNumberOfWorkers();
          int w=r.getWageRange();
          Class.forName(Utils.driver);
          Connection con=DriverManager.getConnection(Utils.url,Utils.user,Utils.pass);
          PreparedStatement ps=con.prepareStatement("Insert Into Requirement values("+n+",?,?,?,?,?,?,"+w+")");
          ps.setString(1, r.getGender());
          ps.setString(2, r.getWorkName());
          ps.setString(3, r.getWages_Mode());
          ps.setString(4, r.getStatDate());
          ps.setString(5, r.getEndDate());
          ps.setString(6, r.getReqAddress());
          ps.setString(7, r.getCity());
          ResultSet rs=ps.executeQuery();

      }
      catch(Exception ex)
      {

      }
      return(x);
    }
    public String getOrganisationId() {
        return OrganisationId;
    }

    public void setOrganisationId(String OrganisationId) {
        this.OrganisationId = OrganisationId;
    }

    public String getRequestNumber() {
        return RequestNumber;
    }

    public void setRequestNumber(String RequestNumber) {
        this.RequestNumber = RequestNumber;
    }

    public int getNumberOfWorkers() {
        return NumberOfWorkers;
    }

    public void setNumberOfWorkers(int NumberOfWorkers) {
        this.NumberOfWorkers = NumberOfWorkers;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getWorkName() {
        return WorkName;
    }

    public void setWorkName(String WorkName) {
        this.WorkName = WorkName;
    }

    public String getWages_Mode() {
        return Wages_Mode;
    }

    public void setWages_Mode(String Wages_Mode) {
        this.Wages_Mode = Wages_Mode;
    }

    public String getStatDate() {
        return StatDate;
    }

    public void setStatDate(String StatDate) {
        this.StatDate = StatDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getReqAddress() {
        return ReqAddress;
    }

    public void setReqAddress(String ReqAddress) {
        this.ReqAddress = ReqAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getWageRange() {
        return WageRange;
    }

    public void setWageRange(int WageRange) {
        this.WageRange = WageRange;
    }

}
